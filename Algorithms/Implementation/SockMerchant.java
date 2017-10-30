import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(ar[i]))
            {  
               hm.put(ar[i], hm.get(ar[i])+1);
            }
            else
            {
                hm.put(ar[i],1);   
            }
        }    
        int count =0; 
        //System.out.println(hm.keySet());
        Set<Integer> keys = hm.keySet();  
        for(Integer i: keys)
{
            count=count+hm.get(i)/2;
}

        return count;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
