package AllaboutDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * y:year
 * Y:week year
 * M:month in year(context sensitive)
 * L::month in year(standalone form)
 * w:week in year;
 * W:week in month;
 * d:day in year
 * D:day in month
 * F:day of  week in month
 * E:day name in week
 * u:day number in week
 * a:Am/Pm marker
 * H:hour in day(0-23)
 * k:hour in day(1-24)
 * K:hour in am/pm(0-11)
 * h:hour in am/pm(1-12)
 * m:minute in hour
 * s:second in minute
 * S:millionSecond
 * z/Z/X:time zone
 */
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat dateFormat2 = new SimpleDateFormat("YYYY-LL-D ");
        DateFormat dateFormat3 = new SimpleDateFormat("F");
        DateFormat dateFormat4 = new SimpleDateFormat("E");
        System.out.println(simpleDateFormat1.format(new Date()));
        System.out.println(dateFormat2.format(new Date()));
        System.out.println(dateFormat3.format(new Date()));
        System.out.println(dateFormat4.format(new Date()));
    }
}
