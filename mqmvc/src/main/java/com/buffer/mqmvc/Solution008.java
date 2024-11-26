package com.buffer.mqmvc;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result008 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
       DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
      Date date = null;
      String output = null;
      try{
         
         date= df.parse(s);
         
         output = outputformat.format(date);
         
         //System.out.println(output);
      }catch(ParseException pe){
         pe.printStackTrace();
       }
       return output;
    }

}

public class Solution008 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result008.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}