import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void nextMove(int n, int r, int c, String [] grid){
        int i, j, i_p = 0, j_p = 0, i_m = 0, j_m = 0;
        char[][] mGrid = new char[n][n];
        //Convert array of string to 2-D array of char
        for (i=0; i<n; i++){
            mGrid[i]= grid[i].toCharArray();
        }
        i_m = r;
        j_m = c;
        //Search for princess' position
        for (i=0; i<n; i++){
            for(j=0;j<n;j++){
                if (mGrid[i][j]=='p'){
                    i_p = i;
                    j_p = j;
                }
            }
        }
        //Last move
        if (j_m != j_p){
            i_m = i_p;
            if (j_m < j_p){
                j_m = j_p - 1;
                System.out.printf("RIGHT\n");
            } else {
                j_m = j_p  + 1;
                System.out.printf("LEFT\n");
            }
        } else if (j_m == j_p){
            if (i_m < i_p){
                i_m = i_p - 1;
                System.out.printf("DOWN\n");
            } else {
                i_m = i_p  + 1;
                System.out.printf("UP\n");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];
        
        
        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }
        
        nextMove(n,r,c,grid);
        
    }
}
