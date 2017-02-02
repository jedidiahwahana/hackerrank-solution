import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int level = 1;
        for (int i=1; i<=n; i++){
            for (int j=n; j>0; j--){
                if(j>i)
                    System.out.printf(" ");
                else if (j<=i)
                    System.out.printf("#");
            }
            System.out.printf("\n");
        }
    }
}
