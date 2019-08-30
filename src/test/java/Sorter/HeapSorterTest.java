package Sorter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HeapSorterTest {

    private Sorter sorter;

    @Before
    public void setup() {
        sorter = new HeapSorter();
    }

    @Test
    public void when_sortListOfLongs_then_listIsSorted() {
        List<Long> defaultList = new ArrayList<>(Arrays.asList(7L, 4L, 3L, 6L, 3L));
        List<Long> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortListOfStrings_then_listIsSorted() {
        List<String> defaultList = new ArrayList<>(Arrays.asList("Damian", "Aneta", "Bartek", "Szymek", "Dorota", "Amadeusz"));
        List<String> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortListOfDoubles_then_listIsSorted() {
        List<Double> defaultList = new ArrayList<>(Arrays.asList(4.5, 4.3, 4.6, 3.0, 3.3, 6.6, 2.0));
        List<Double> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

}
