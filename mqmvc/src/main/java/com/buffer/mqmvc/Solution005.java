package com.buffer.mqmvc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result005 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
      int total=n;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++) {
            if(j<(total-1)){
               System.out.print(" "); 
            }
            if(j>=(total-1)){
                System.out.print("#");
                
            }
        }
        total--; 
        System.out.print("\n"); 
      }
    }

}

public class Solution005 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result005.staircase(n);

        bufferedReader.close();
    }
}