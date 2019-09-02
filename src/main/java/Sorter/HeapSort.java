package Sorter;

import java.util.Collections;
import java.util.List;

/**
 * Heap sort algorithm class for sorting list.
 */
public class HeapSort implements Sorter {

    private int heapSize;
    private HeapIndexCalculator leftIndex = x -> 2 * x + 1;
    private HeapIndexCalculator rightIndex = x -> 2 * x + 2;

    /**
     * {@link Sorter}
     *
     * Worst case time complexity - O(n*lg(n))
     * Best case time complexity - O(n*lg(n))
     *
     * @param list {@link Sorter}
     * @param <T> {@link Sorter}
     */
    @Override
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        buildHeap(list);
        for (int i = (list.size() - 1); i >= 1; i--) {
            Collections.swap(list, 0, i);
            heapSize -= 1;
            heapify(list, 0);
        }
    }

    /**
     * Restoring heap characteristics.
     *
     * @param list {@link Sorter}
     * @param i - array index
     * @param <T> {@link Sorter}
     */
    private <T extends Comparable<? super T>> void heapify(List<T> list, int i) {
        int largest = i;
        int left = leftIndex.calculate(i);
        int right = rightIndex.calculate(i);

        if (left <= heapSize && list.get(left).compareTo(list.get(i)) > 0) {
            largest = left;
        }

        if (right <= heapSize && list.get(right).compareTo(list.get(largest)) > 0) {
            largest = right;
        }

        if (largest != i) {
            Collections.swap(list, i, largest);
            heapify(list, largest);
        }
    }

    /**
     * Builds the heap.
     *
     * @param list {@link Sorter}
     * @param <T> {@link Sorter}
     */
    private <T extends Comparable<? super T>> void buildHeap(List<T> list) {
        heapSize = list.size() - 1;
        for (int i = (list.size() / 2); i >= 0; i--) {
            heapify(list, i);
        }
    }
}
