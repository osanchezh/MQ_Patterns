package com.buffer.mqmvc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result2 {



    public static int birthdayCakeCandles(List<Integer> candles) {
    
      HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
      for(int i=0;i<candles.size();i++){
           int key=candles.get(i);
           if(mapa.containsKey(key)){
               int contador = mapa.get(key);
               contador++;
               mapa.put(key, contador);
               System.out.println("key1="+key+"-v="+contador);
           }else{
               mapa.put(key, 1);
           }
      }
      int maximo=0;
      int inicio=mapa.get(candles.get(0));
      System.out.println("*"+inicio);
      for (Map.Entry<Integer, Integer> e : mapa.entrySet()){
          System.out.println("key="+e.getKey()+"-v="+e.getValue());
    	  if(e.getValue()>=inicio){
              maximo=e.getValue();
              inicio=maximo;
          }
      }
      return maximo;

    }

    public static int birthdayCakeCandles2(List<Integer> candles) {
    // Write your code here

        int count = 0;
        int max = 0;
        int length = candles.size();
        
        for(int i = 0; i < length; i++)
        {
            int num = candles.get(i);
            if(num > max){
            max=num;
            }
        }
        for(int i = 0; i < length; i++)
        {
            int num = candles.get(i);
            if(max == num){
            count++;
            }
        }
    return count;

    }
}

public class Result {
    public static void main(String[] args) throws IOException {
  
        String[] candlesTemp = new String[] {"44" ,"53", "31", "27", "77", "60" ,"66", "77", "26", "36"};;

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }
        int result = Result2.birthdayCakeCandles2(candles);
        System.out.println("="+result);


    }
}