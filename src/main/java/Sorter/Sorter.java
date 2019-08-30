package Sorter;

import java.util.List;

public interface Sorter {
    /**
     * Sorts specified list, whose elements must implement the {@link Comparable}, into
     * ascending order, based on {@link Comparable} natural ordering.
     *
     * @param list list to be sorted
     * @param <T> class of objects to be sorted
     */
    <T extends Comparable<? super T>> void sort(List<T> list);
}
