// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-30, 10:50 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.printf("%d\n",A.length()+B.length());
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
      // StringBuilder sb =new StringBuilder(A.length());
      String sb = A.substring(0,1).toUpperCase()+A.substring(1);
       
       //StringBuilder sb1 =new StringBuilder(B.length());
       String  sb1 = B.substring(0,1).toUpperCase()+B.substring((1)); 
        System.out.println(sb.toString()+" "+sb1.toString());
        
    }
}



