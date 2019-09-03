# Sorting-Algorithms

This might not be the best way to implement these algorithms, as it's based on the List interface and the objects which has to implement Comparable interface. Eventho it's List interface, it's better to pass ArrayList here.

For now it contains a couple of sorting algorithms:
* Bubble sort
* Heap Sort
* Insert Sort
* Quick Sort
* Selection Sort

### How to use it

```
// T has to implement Comparable interface
List<T> list = new ArrayList();

// E.g. HeapSort
Sorter sorter = new HeapSort();
sorter.sort(list);
```

### Which one will be the best

My favourite one is **Heap sort**, because there is no such thing as _bad data_. There will be always similar sorting time, no matter how our initial data, which you want to sort, is placed in the list. 

For example, consider that you're going to use **Quick sort**, which has been implemented here. If you happen to sort a list which is already sorted either normally or in reverse, you're going to encounter worst case scenario as this is considered _bad data_ for this algorithm.
