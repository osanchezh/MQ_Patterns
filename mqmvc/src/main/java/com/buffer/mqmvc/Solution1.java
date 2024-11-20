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



class Result1 {

    /*
     * Complete the 'IsBalancedString' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING s as parameter.
     */

    public static boolean IsBalancedString(String s) {
    	char a = 'a';
    	int count_a=0;
    	char b = 'b';
    	int count_b=0;
    	char c = 'c';
    	int count_c=0;
    	char d = 'd';
    	int count_d=0;
    	for (int i = 0; i < s.length(); i++) {
            // Print current character
            
            if(s.charAt(i)==a) {count_a++;}
            else if(s.charAt(i)==b) {count_b++;}
            else if(s.charAt(i)==c) {count_c++;}
            else if(s.charAt(i)==d) {count_d++;}
            
        }
    	boolean validacion =false;
    	if(count_a!=count_c) {validacion=false;}
    	else if(count_a==count_c) {validacion=true;}
    	else {validacion=false;}
    	
    	if(validacion) {
        	if(count_b!=count_d) {validacion=false;}
        	else if(count_b==count_d) {validacion=true;}
        	else {validacion=false;}
    	}
    	return validacion;
    }

}

//System.out.println("count_a="+count_a);
//System.out.println("count_c="+count_c);
//System.out.println("count_b="+count_b);
//System.out.println("count_d="+count_d);

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        //BufferedWriter bufferedWriter = new BufferedWriter();
        String s = bufferedReader.readLine();

        boolean result = Result1.IsBalancedString(s);
        System.out.println(result+"");
        //bufferedWriter.write(String.valueOf(result ? 1 : 0));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}