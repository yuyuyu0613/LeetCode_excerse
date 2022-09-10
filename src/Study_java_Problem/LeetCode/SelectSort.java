package Study_java_Problem.LeetCode;

public class SelectSort implements Sort {

    @Override
    public <T extends Comparable<T>> T[] selectSort(T[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        for (int i = 0; i < array.length-1; i++) {

            int minIndex=i;
            T min = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (min.compareTo(array[j]) > 0) {
                    min = array[j];
                    minIndex=j;

                }

            }
            array[minIndex]=array[i];
            array[i]=min;


        }
        return array;
    }
}


