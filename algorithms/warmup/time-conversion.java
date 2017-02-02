import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        if (time.contains("PM")){
            if (!(time.substring(0,2).equals("12"))){
                int newHour = Integer.parseInt(time.substring(0,2)) + 12;
                time = time.replaceAll(time.substring(0,2), Integer.toString(newHour));
            }
            time = time.replace("PM", "");
        } else if (time.contains("AM")){
            if (time.substring(0,2).equals("12"))
                time = time.replaceAll(time.substring(0,2), "00");
            time = time.replace("AM", "");
        }
        System.out.println(time);
    }
}
