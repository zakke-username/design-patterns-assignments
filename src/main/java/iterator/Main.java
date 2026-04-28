package iterator;

import java.util.Iterator;

public class Main {
    static void main() {
        Sequence fibonacci = new FibonacciSequence(10);
        Iterator<Integer> iterator = fibonacci.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
