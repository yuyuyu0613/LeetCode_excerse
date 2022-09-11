package JavaVideo.Test.Test1;

import java.util.Date;

public class Demo4 {
    public static void main(String[] args) {
        try {

            int[] arr={1,2,3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException d) {
            System.out.println("NOT FUNDING");
            d.printStackTrace();
            System.out.println(d.getMessage());
        }
        System.out.println("end");

    }
}
