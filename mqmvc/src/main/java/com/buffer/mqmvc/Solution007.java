package com.buffer.mqmvc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result007 {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    
      HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
      for(int i=0;i<candles.size();i++){
           int key=candles.get(i);
           if(mapa.containsKey(key)){
               int contador = mapa.get(key);
               contador++;
               mapa.put(key, contador);
           }else{
               mapa.put(key, 1);
           }
      }
      int maximo=0;
      int inicio=mapa.get(candles.get(0));
      System.out.println("*"+inicio);
      for (Map.Entry<Integer, Integer> e : mapa.entrySet()){
          if(e.getValue()>=inicio){
              maximo=e.getValue();
              inicio=maximo;
          }
      }
      return maximo;

    }

}

public class Solution007 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = Result007.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}