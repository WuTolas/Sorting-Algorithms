package Sorter;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class SorterTest {
    protected Sorter sorter;

    @Test
    public void when_sortEvenArrayListOfRandomLongs_then_listIsSorted() {
        List<Long> defaultList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            long randomLong = (long) (Math.random() * 100);
            defaultList.add(randomLong);
        }
        List<Long> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortOddArrayListOfRandomLongs_then_listIsSorted() {
        List<Long> defaultList = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            long randomLong = (long) (Math.random() * 100);
            defaultList.add(randomLong);
        }
        List<Long> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortEvenArrayListOfRandomDoubles_then_listIsSorted() {
        List<Double> defaultList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            double randomDouble = Math.random() * 100;
            defaultList.add(randomDouble);
        }
        List<Double> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortOddArrayListOfRandomDoubles_then_listIsSorted() {
        List<Double> defaultList = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            double randomDouble = Math.random() * 100;
            defaultList.add(randomDouble);
        }
        List<Double> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortEvenArrayListOfRandomChars_then_listIsSorted() {
        Random r = new Random();
        List<Character> defaultList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            char randomChar = (char)(r.nextInt(26) + 'a');
            defaultList.add(randomChar);
        }
        List<Character> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortOddArrayListOfRandomChars_then_listIsSorted() {
        Random r = new Random();
        List<Character> defaultList = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            char randomChar = (char)(r.nextInt(26) + 'a');
            defaultList.add(randomChar);
        }
        List<Character> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortEvenArrayListOfRandomStrings_then_listIsSorted() {
        List<String> defaultList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            String randomString = RandomStringUtils.randomAlphabetic(6);
            defaultList.add(randomString);
        }
        List<String> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

    @Test
    public void when_sortOddArrayListOfRandomStrings_then_listIsSorted() {
        List<String> defaultList = new ArrayList<>();
        for (int i = 0; i < 999; i++) {
            String randomString = RandomStringUtils.randomAlphabetic(6);
            defaultList.add(randomString);
        }
        List<String> sortedList = defaultList.stream().sorted().collect(Collectors.toList());

        sorter.sort(defaultList);

        Assert.assertEquals(sortedList, defaultList);
    }

}
