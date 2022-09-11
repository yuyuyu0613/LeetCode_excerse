package JavaVideo.Test.Test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3_date {
    public static void main(String[] args) throws ParseException {

//        Date d1 = new Date();
////        System.out.println(d1.getTime()*1.0/1000/60/60/24/365);
////        System.out.println(System.currentTimeMillis());
////
////        d1.setTime(System.currentTimeMillis());
////        System.out.println(d1);
//        SimpleDateFormat format = new SimpleDateFormat("M年dHsHm");
//        System.out.println(format.format(d1));
        String ss = "2022-09-12 11:11:11";
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy- MM-dd HH:mm:ss");
        Date d2=format1.parse(ss);
        System.out.println(d2);


    }
}
