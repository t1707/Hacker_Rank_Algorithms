import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        Arrays.sort(ar);
        int type=ar[0];
        int max=-1;
        int count =0;
        int pos=0;
        for(int i =0; i<n-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                count++;
                if(count>max)
                {
                    max=count;
                    pos=i;
                }
            }
            else
            {
                count=0;
            }
        }
        return ar[pos];
        
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
