// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
// Problem     Plus Minus
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-11-15, 12:53 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int plus=0,minus=0,zero =0;
        double N = arr.size();
        for(int i=0;i<N;i++){
            if(arr.get(i)>0){
                plus++;
            }else if(arr.get(i)<0){
                minus++;
            }else{
                zero++;
            }
        }
        System.out.printf("%f\n%f\n%f\n",plus/N,minus/N,zero/N);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
