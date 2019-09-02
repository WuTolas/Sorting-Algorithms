package Sorter;

import java.util.List;

/**
 * Insertion sort algorithm class for sorting list.
 */
public class InsertionSort implements Sorter {

    /**
     * {@link Sorter}
     *
     * Worst case time complexity - O(n2)
     * Best case time complexity - O(n) -> when list is already sorted
     *
     * @param list {@link Sorter}
     * @param <T> {@link Sorter}
     */
    @Override
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T key = list.get(i);
            int j = i - 1;
            while (j >= 0 && key.compareTo(list.get(j)) < 0) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, key);
        }
    }
}
