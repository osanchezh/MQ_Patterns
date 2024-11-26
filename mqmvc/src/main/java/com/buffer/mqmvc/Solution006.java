package com.buffer.mqmvc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result006 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here

      long sumaMenor=0;
      int contador=0;
      long sumaMayor=0;
      long cantidad=0;

      List<Long> arr1= new ArrayList<Long>();
      for(int j=0;j<arr.size();j++){
       cantidad=0;
       for(int i=0;i<arr.size();i++){
          if(contador!=i){
              cantidad+=arr.get(i);
          }
       }
       contador++;
       arr1.add(cantidad);
      }
      sumaMenor= arr1.get(0);
      sumaMayor= arr1.get(0);
      for(Long t:arr1){
        if(t<sumaMenor){
           sumaMenor=t; 
        } 
        if(t>sumaMayor){
           sumaMayor=t; 
        } 
      }
      System.out.println(sumaMenor+" "+sumaMayor);
    }

}

public class Solution006 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result006.miniMaxSum(arr);

        bufferedReader.close();
    }
}
