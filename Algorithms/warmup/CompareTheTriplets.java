/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from  to  for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet , and the rating for Bob's challenge to be the triplet .

Your task is to find their comparison points by comparing  with ,  with , and  with .

If , then Alice is awarded  point.
If , then Bob is awarded  point.
If , then neither person receives a point.
Comparison points is the total points a person earned.

Given  and , can you compare the two challenges and print their respective comparison points?

Input Format

The first line contains  space-separated integers, , , and , describing the respective values in triplet . 
The second line contains  space-separated integers, , , and , describing the respective values in triplet .

Constraints

Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.
*/
static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] result={0,0};
        result[0]= (a0>b0?1:0)+(a1>b1?1:0)+(a2>b2?1:0);
        result[1]= (a0<b0?1:0)+(a1<b1?1:0)+(a2<b2?1:0);
        // Complete this function
        return result;
    }
