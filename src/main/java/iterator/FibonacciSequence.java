package iterator;

import java.util.Iterator;

public class FibonacciSequence implements Sequence {

    private int length;

    public FibonacciSequence(int length) {
        this.length = Math.max(length, 0);
    }

    public int getNextNumber(int prev, int curr) {
        return prev + curr;
    }

    public int getLength() {
        return length;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator(this);
    }
}
