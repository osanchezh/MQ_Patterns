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


class Result105 {

    /*
     * Complete the 'maxLength' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     */

    public static int maxLength(List<Integer> a, int k) {
    // Write your code here
      //LinkedHashMap<Integer,List<Integer>> mapa= new LinkedHashMap<Integer,List<Integer>>();
      int resultado=0;
      for(int i=0;i<a.size();i++){
    	  
          if(a.get(i)==k){
              resultado=1;
              //System.out.println("1.a.get(i)="+a.get(i));
          }
      }
      if(resultado==0){
       int max=a.size()-1;
       int mayor=0;
       for(int i=0;i<a.size();i++){
         
         if(max>(i)){
             mayor=i+1;
         }else{
        	 mayor=max;
         }
          //System.out.println("2.a.get(i)="+a.get(i)+","+a.get(mayor)+",mayor="+mayor+",i="+i+",mayor="+mayor);
          if(i!=mayor) {
           if(a.get(i)+a.get(mayor)==k){
              resultado=2;
              //System.out.println("es 2");
           }
          }
       }
      }
      if(resultado==0){
          int max= a.size()/2;
          int elements=3;
          for(int i=0;i<max;i++){
            int suma=0;
            //System.out.println("max="+max);
            //System.out.print("suma=");
            for(int j=i;j<elements;j++){
               //System.out.print(a.get(j)+",");
               suma+=a.get(j);
               //System.out.print("3.suma="+suma);
               if(suma==k){
            	   resultado= 3;
                   //System.out.println("es 3");
               }
            }
            //System.out.println("\n");
            elements++;
          }
      }
    
      return resultado;
    }

}


public class Solution105 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temporal.txt"));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result105.maxLength(a, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}