import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] c = new int[n];
        //Count total cost for all menu
        int totalCost = 0;
        for(int i=0; i<n; i++){
            c[i] = s.nextInt();
            totalCost += c[i];
        }
        int bCharged = s.nextInt();
        //Count Anna's actual charged
        int bActual = (totalCost - c[k])/2;
        //Determine refund or not
        if(bCharged == bActual)
            System.out.println("Bon Appetit");
        else
            System.out.println(bCharged-bActual);
    }
}
