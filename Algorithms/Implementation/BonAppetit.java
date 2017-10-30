import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        int sum = IntStream.of(ar).sum();
        if((sum-ar[k])/2==b)
        {
            return -1;
            
        }
        else
        {
            return ar[k]/2;
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result==-1)
        {
            System.out.println("Bon Appetit");
     
        }
        else
        {
                 System.out.println(result);   
        }
    }
}
