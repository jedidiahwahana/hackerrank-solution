import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(c[i]!=-1){
                for(int j=i+1; j<n; j++){
                    if(c[i]==c[j]){
                        count++;
                        c[i]=-1; c[j]=-1;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
