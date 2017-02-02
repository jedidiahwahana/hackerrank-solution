import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int n = in.nextInt();
        String sMin = "zzz";
        String sMax = "AAA";
        for (int i=0; i+n-1<S.length(); i++){
            String sString = S.substring(i, i+n);
            if (sString.compareTo(sMin) < 0)
                sMin = sString;
            if (sString.compareTo(sMax) > 0)
                sMax = sString;
        }
        System.out.println(sMin);
        System.out.println(sMax);
    }
}
