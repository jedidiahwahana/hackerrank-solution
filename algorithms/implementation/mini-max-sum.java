import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long[] number = {a,b,c,d,e};
        long sum = a+b+c+d+e;
        long max = 0;
        long min = sum;
        for (int i = 0; i<5; i++){
            long tempSum = sum - number[i];
            if (tempSum < min)
                min = tempSum;
            if (tempSum > max)
                max = tempSum;
        }
        System.out.println(Long.toString(min) + " " + Long.toString(max));
    }
}
