package Study_java_Problem.exercise;

import java.util.ArrayList;

public class Exercise {
    
    public static Object[] sortSelect(Object[] array) {
        for(int j=0;j<array.length-1;j++) {
            Object a = array[j];
            for (int i = j+1; i < array.length; i++)
                if (compare(a,array[i])) {
                    a = array[i];
                }
            array[j]=a;
        }
            


        return array;

    }

    public static boolean compare(Object a,Object b){
        return false;
    }
    public static void myPrint(Object[] array){
        for(Object a:array){
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) {
        Object[] array=new Object[5];
        for(int i=0;i<4;i++){
            array[i]= new Integer(i+5);
        }
        array[4]=new Integer(1);

        sortSelect(array);
        myPrint(array);
        
    }
}
