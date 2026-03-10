package strategy;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static void main() {
        // Bubble sort strategy
        System.out.println("\nBUBBLE SORT");
        SortHandler sortHandler = new SortHandler(new BubbleSort());
        printSortPerformance(sortHandler);

        // Selection sort strategy
        System.out.println("\nSELECTION SORT");
        sortHandler.setSortStrategy(new SelectionSort());
        printSortPerformance(sortHandler);

        // Insertion sort strategy
        System.out.println("\nINSERTION SORT");
        sortHandler.setSortStrategy(new InsertionSort());
        printSortPerformance(sortHandler);
    }

    // Sort, time, and print results
    public static void printSortPerformance(SortHandler sortHandler) {
        int[] shortArr = randomIntArray(30, 0, 1000);
        long startTime = System.nanoTime();
        sortHandler.sort(shortArr);
        System.out.println("- Time for short array: " + (System.nanoTime() - startTime) / 1_000_000.0 + " ms");

        int[] longArr = randomIntArray(100000, 0, 1000);
        startTime = System.nanoTime();
        sortHandler.sort(longArr);
        System.out.println("- Time for long array: " + (System.nanoTime() - startTime) / 1_000_000.0 + " ms");
    }

    // Generate array of random ints
    public static int[] randomIntArray(int length, int min, int max) {
        Random rand = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
