import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] aArray = {a0, a1, a2};
        int[] bArray = {b0, b1, b2};
        
        int aScore = 0;
        int bScore = 0;
        for (int i=0; i<3; i++){
            if(aArray[i] > bArray[i])
                aScore++;
            else if (aArray[i] < bArray[i])
                bScore++;
        }
        System.out.println(Integer.toString(aScore) + " " + Integer.toString(bScore));
    }
}
