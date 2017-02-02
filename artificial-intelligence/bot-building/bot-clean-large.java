import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void next_move(int posr, int posc, int dimh, int dimw, String[] board){
        int dirtX = -1; int dirtY = -1;
        int distance = 999;
        //Find nearest dirt
        for (int j=0; j<dimh; j++){
            for (int i=0; i<dimw; i++){
                if (board[j].charAt(i)=='d'){
                    //Count distance to dirt
                    int tempDistance = Math.abs(j-posr) + Math.abs(i-posc);
                    if (tempDistance < distance){
                        dirtX = j; dirtY = i;
                        distance = tempDistance;
                    }
                }
            }
        }
        
        //Determine next move
        if (posr == dirtX && posc == dirtY){
            System.out.println("CLEAN");
        } else if (posr == dirtX){
            if (posc < dirtY)
                System.out.println("RIGHT");
            if (posc > dirtY)
                System.out.println("LEFT");
        } else if (posc == dirtY){
            if (posr < dirtX)
                System.out.println("DOWN");
            if (posr > dirtX)
                System.out.println("UP");
        } else if (posc < dirtY){
            System.out.println("RIGHT");
        }else if (posc > dirtY){
            System.out.println("LEFT");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        int [] dim = new int[2];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<2;i++) dim[i] = in.nextInt();
        String board[] = new String[dim[0]];
        for(int i=0;i<dim[0];i++) board[i] = in.next();
        next_move(pos[0], pos[1], dim[0], dim[1], board);
    }
}
