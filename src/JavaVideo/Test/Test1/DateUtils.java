package JavaVideo.Test.Test1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){}
    public static String dateToString(Date date,String format){
        SimpleDateFormat a=new SimpleDateFormat(format);
        return a.format(date);
    }
}
