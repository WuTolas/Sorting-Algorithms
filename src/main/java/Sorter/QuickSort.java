package Sorter;

import java.util.Collections;
import java.util.List;

/**
 * Quick sort algorithm class for sorting list.
 */
public class QuickSort implements Sorter {

    /**
     * {@link Sorter}
     *
     * Worst case time complexity - O(n^2)
     * Best case time complexity - O(n*lg(n))
     *
     * @param list {@link Sorter}
     * @param <T> {@link Sorter}
     */
    @Override
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        quickSort(list, 0, list.size() - 1);
    }

    /**
     * Actual induction of the quick sort
     *
     * @param list {@link Sorter}
     * @param first sub/array index
     * @param last sub/array index
     * @param <T> {@link Sorter}
     */
    private <T extends Comparable<? super T>> void quickSort(List<T> list, int first, int last) {
        if (first < last) {
            int partitionIndex = partition(list, first, last);
            quickSort(list, first, partitionIndex);
            quickSort(list, partitionIndex + 1, last);
        }
    }

    /**
     * @param list {@link Sorter}
     * @param first sub/array index
     * @param last sub/array index
     * @param <T> {@link Sorter}
     */
    private <T extends Comparable<? super T>> int partition(List<T> list, int first, int last) {
        T pivot = list.get(last);
        int i = first - 1;
        for (int j = first; j < last; j++) {
            if (list.get(j).compareTo(pivot) <= 0) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i+1, last);
        return i;
    }
}
