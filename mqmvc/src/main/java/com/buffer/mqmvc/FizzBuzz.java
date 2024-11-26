package com.buffer.mqmvc;
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



class Result45 {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
     int varA=3;
     int varB=5;
     
     for(int i=1;i<=n;i++) {
    	 String result="";
    	 if(i%varA==0) {
    		 result+="Fizz";
    	 }
    	 if(i%varB==0) {
    		 result+="Buzz";
    	 }
    	 if(result.isEmpty()){
    		 result+=String.valueOf(i);
    	 }
    	 System.out.println(result);
     }
    }

}

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
//int i=010;
//int j=07;
//System.out.println("h"+i);
//System.out.println(j);
        Result45.fizzBuzz(n);

        bufferedReader.close();
    }
}
