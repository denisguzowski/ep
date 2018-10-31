package model;

import model.utilities.RandomNumberGenerator;

import java.util.*;

public class ListSetGenerator {
    public List<Integer> getIntegerArrayList(int size, int minVal, int maxVal){
        Integer[] array = RandomNumberGenerator.getRandomIntegerArray(size, minVal, maxVal);
        return new ArrayList<>(Arrays.asList(array));
    }

    public List<Integer> getIntegerLinkedList(int size, int minVal, int maxVal){
        Integer[] array = RandomNumberGenerator.getRandomIntegerArray(size, minVal, maxVal);
        return new LinkedList<>(Arrays.asList(array));
    }

    //-----------------------------------------------------------------------

    public Set<Integer> getIntegerHashSet(int size, int minVal, int maxVal){
        Integer[] array = RandomNumberGenerator.getRandomIntegerArray(size, minVal, maxVal);
        return new HashSet<>(Arrays.asList(array));
    }

    public Set<Integer> getIntegerLinkedHashSet(int size, int minVal, int maxVal){
        Integer[] array = RandomNumberGenerator.getRandomIntegerArray(size, minVal, maxVal);
        return new LinkedHashSet<>(Arrays.asList(array));
    }

    public Set<Integer> getIntegerTreeSet(int size, int minVal, int maxVal){
        Integer[] array = RandomNumberGenerator.getRandomIntegerArray(size, minVal, maxVal);
        return new TreeSet<>(Arrays.asList(array));
    }
}
