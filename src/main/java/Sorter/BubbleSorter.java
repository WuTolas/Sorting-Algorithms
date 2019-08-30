package Sorter;

import java.util.Collections;
import java.util.List;

/**
 * Bubble sort algorithm class for sorting list.
 */
public class BubbleSorter implements Sorter {

    /**
     * {@link Sorter}
     *
     * Worst case time complexity - O(n2)
     * Best case time complexity - O(n) -> when list is already sorted
     *
     * @param list list to be sorted
     * @param <T> class of objects to be sorted
     */
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < list.size() - (i+1); j++) {
                if (list.get(j).compareTo(list.get(j+1)) > 0 ) {
                    Collections.swap(list, j, j+1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

}
