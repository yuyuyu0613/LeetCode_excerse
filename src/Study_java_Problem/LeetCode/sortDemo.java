package Study_java_Problem.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class sortDemo {


    public static void main(String[] args) {
        Integer[] array = {1, 0, -2, 6, 7, 9, 3};
//        int[] c={1, 0, -2, 6, 7, 9, 3};
//        Integer[] b = new Integer[5];
//        for (int i = 3; i < 8; i++) {
//            b[i] = b[i].valueOf(i);
//        }
        new SelectSort().selectSort(array);
        List<Integer> list = Arrays.asList(array);
        System.out.println(list);

    }



}
