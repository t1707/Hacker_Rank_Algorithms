/*
You are given an array of integers of size . You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input Format

The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.

Output Format

Print a single value equal to the sum of the elements in the array.
*/
static long aVeryBigSum(int n, long[] ar) {
        long sum=0;
        for(int i=0;i<n;i++)
        {
         sum=sum+ar[i];    
        }
        // Complete this function
        return sum;
    }
