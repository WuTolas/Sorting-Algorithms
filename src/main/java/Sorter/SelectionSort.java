package Sorter;

import java.util.Collections;
import java.util.List;

/**
 * Selection sort algorithm class for sorting list.
 */
public class SelectionSort implements Sorter {

    /**
     * {@link Sorter}
     *
     * Time complexity - O(n2)
     *
     * @param list {@link Sorter}
     * @param <T> {@link Sorter}
     */
    @Override
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(min).compareTo(list.get(j)) > 0) {
                    min = j;
                }
            }
            Collections.swap(list, min, i);
        }
    }
}
