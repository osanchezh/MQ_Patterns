package com.buffer.mqmvc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result004 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        int positive=0;
        int negative=0;
        int zero=0;
        int suma=arr.size();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                positive++;
            }
            if(arr.get(i)<0){
                negative++;
            }
            if(arr.get(i)==0){
                zero++;
            }
        }
        BigDecimal bdpos=new BigDecimal(positive);
        BigDecimal bdneg=new BigDecimal(negative);
        BigDecimal bdzero=new BigDecimal(zero);
        BigDecimal bdsuma=new BigDecimal(suma);
        
        System.out.println(bdpos.divide(bdsuma,6, RoundingMode.CEILING).toString());
        System.out.println(bdneg.divide(bdsuma,6, RoundingMode.CEILING).toString());
        System.out.println(bdzero.divide(bdsuma,6, RoundingMode.CEILING).toString());
    }

}

public class Solution004 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result004.plusMinus(arr);

        bufferedReader.close();
    }
}