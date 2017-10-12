/*
Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Constraints

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int diff=0;
        int[][] array = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=sc.nextInt();
                
                if(j==i)
                {
                    diff=diff+array[i][j];
                }
                if(j==n-i-1)
                {
                    diff=diff-array[i][j];
                }
            }
        }
        System.out.println(diff>0?diff:-1*diff);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
