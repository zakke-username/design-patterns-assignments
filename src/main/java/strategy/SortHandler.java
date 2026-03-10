package strategy;

public class SortHandler {
    private SortStrategy sortStrategy;

    public SortHandler(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] arr) {
        sortStrategy.sort(arr);
    }
}
