import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar cal = new GregorianCalendar(Integer.parseInt(year),
                                             (Integer.parseInt(month)-1),(Integer.parseInt(day)-1));
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String days[]={"", "MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        System.out.println(days[dayOfWeek]);
    }
}
