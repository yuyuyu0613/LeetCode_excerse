package Study_java_Problem.Example;

import java.util.Arrays;
import java.util.List;

public class testDemo {
        public static void main(String[] args) {
            // 声明一个Int类型数组
            Character[] arr1 = {'c','b','r','a','s'};
            // 调用bubbleSort方法进行排序

            new bubbleImplement().bubbleSort(arr1);
            // asLint()方法将当前数组转化为list集合
            List<Character> list = Arrays.asList(arr1);
            System.out.println(list);
        }
    }

