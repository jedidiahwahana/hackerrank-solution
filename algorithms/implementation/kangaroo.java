import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        //The kangaroos won't be on the same position if the one which already ahead has faster speed
        if ((x2>x1 && v2>=v1) || (x1>x2 && v1>=v2)){
            System.out.println("NO");
            return;
        }
        //The kangaroos will be on the same position at the same time if (x1+y*v1) = (x2+y*v2)
        if((x1-x2)%(v2-v1)==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
