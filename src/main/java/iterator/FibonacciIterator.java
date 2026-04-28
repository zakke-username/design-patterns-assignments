package iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private FibonacciSequence sequence;
    private int index = 0;
    private int previous = 1;
    private int current = 1;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean hasNext() {
        return index < sequence.getLength();
    }

    @Override
    public Integer next() {
        if (!hasNext()) throw new Error("Reached number limit");

        if (index <= 1) {
            index++;
            return 1;
        }

        int next = this.sequence.getNextNumber(previous, current);
        previous = this.current;
        current = next;
        index++;

        return next;
    }
}
