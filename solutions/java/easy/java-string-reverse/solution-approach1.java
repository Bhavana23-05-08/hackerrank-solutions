// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-31, 10:04 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A.length());
        for(int i = A.length()-1;i>=0;i--){
            char ch = A.charAt(i);
            sb.append(ch);
        }
        if(sb.toString().equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



