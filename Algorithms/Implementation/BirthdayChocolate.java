/*
Lily has a chocolate bar consisting of a row of  squares where each square has an integer written on it. She wants to share it with Ron for his birthday, which falls on month  and day . Lily wants to give Ron a piece of chocolate only if it contains  consecutive squares whose integers sum to .

Given , , and the sequence of integers written on each square of Lily's chocolate bar, how many different ways can Lily break off a piece of chocolate to give to Ron?

For example, if ,  and the chocolate bar contains  rows of squares with the integers written on them from left to right, the following diagram shows two ways to break off a piece:

image

Input Format

The first line contains an integer denoting  (the number of squares in the chocolate bar). 
The second line contains  space-separated integers describing the respective values of  (the numbers written on each consecutive square of chocolate). 
The third line contains two space-separated integers describing the respective values of  (Ron's birth day) and (Ron's birth month).

Constraints

, where ()
Output Format

Print an integer denoting the total number of ways that Lily can give a piece of chocolate to Ron.

Sample Input 0

5
1 2 1 3 2 
3 2
Sample Output 0

2
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        int count =0;
        for(int i=0;i<n-m+1;i++)
        { 
            int sum=0; 
            for(int j=i;j<i+m;j++)
            {
                sum+=s[j];
            }
            if(sum==d)
            {
                count++;
            }
        }
        return count;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
