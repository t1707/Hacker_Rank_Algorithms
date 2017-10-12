/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range .
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] array = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            array[arr_i] = in.nextLong();
        }
        Arrays.sort(array);
        long min=array[0]+array[1]+array[2]+array[3];
        long max=array[1]+array[2]+array[3]+array[4];
        System.out.printf("%d %d\n", min, max);
        //System.out.println(max);
    }
}
