/*
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<n;i++)
        {
            int temp=sc.nextInt();
            if(temp==0)
            {
                zero++;
            }
            else
            {
               pos+=(temp>0?1:0);
               neg+=(temp<0?1:0);
            }
        }
        System.out.println(String.format("%.6f", (double)pos/n));
        System.out.println(String.format("%.6f", (double)neg/n));
        System.out.println(String.format("%.6f", (double)zero/n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
