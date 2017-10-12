/*
Given a time in -hour AM/PM format, convert it to military (-hour) time.

Note: Midnight is  on a -hour clock, and  on a -hour clock. Noon is  on a -hour clock, and  on a -hour clock.

Input Format

A single string containing a time in -hour clock format (i.e.:  or ), where  and .

Output Format

Convert and print the given time in -hour format, where .

Sample Input

07:05:45PM
Sample Output

19:05:45
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        if(s.substring(0,2).equals("12"))
        {
            if(s.substring(8,10).equals("AM"))
            {
                s="00"+s.substring(2,8);
            }
            else
            {
                s=s.substring(0,8);
            }
            
        }
        else if(s.substring(8,10).equals("AM"))
        {
            s=s.substring(0,8);
        }
        else
        {
            s=String.valueOf(Integer.parseInt(s.substring(0,2))+12)+s.substring(2,8);
        }
        // Complete this function
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
