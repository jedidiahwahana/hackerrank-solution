import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void displayPathtoPrincess(int n, String [] grid){
        //Search for princess position
        int i, j, i_p = 0, j_p = 0, i_m = 0, j_m = 0;
        char[][] mGrid = new char[n][n];
        //Convert string array to 2-D char array
        for (i=0; i<n; i++){
            mGrid[i]= grid[i].toCharArray();
        }
        //Get the position of bot and princess
        for (i=0; i<n; i++){
            for(j=0;j<n;j++){
                if (mGrid[i][j]=='p'){
                    i_p = i;
                    j_p = j;
                }else if (mGrid[i][j]=='m'){
                    i_m = i;
                    j_m = j;
                }
            }
        }
        //Search the closest path
        if (i_m < i_p){
            for (j=0; j<(i_p-i_m); j++)
                System.out.printf("DOWN\n");
        } else {
            for (j=0; j<(i_m-i_p); j++)
                System.out.printf("UP\n");
        }
        if (j_m < j_p){
            for (j=0; j<(j_p-j_m); j++)
                System.out.printf("RIGHT\n");
        } else {
            for (j=0; j<(j_m-j_p); j++)
                System.out.printf("LEFT\n");
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }
        
        displayPathtoPrincess(m,grid);
    }
}
