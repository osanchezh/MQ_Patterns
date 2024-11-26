package com.buffer.mqmvc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result104 {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
      List<Integer> lsthigh=new ArrayList<Integer>();
      List<Integer> lstlow=new ArrayList<Integer>();
      List<Integer> resultado=new ArrayList<Integer>();
      int maxhigh=scores.get(0);
      int minlow=scores.get(0);
      lstlow.add(minlow);
      lsthigh.add(maxhigh);
      for(int i=1;i<scores.size();i++){
          if(scores.get(i)>maxhigh){
            maxhigh=scores.get(i);
            lsthigh.add(maxhigh);
          }else if(scores.get(i)<=maxhigh){
            lsthigh.add(maxhigh);
          }
          if(scores.get(i)<minlow){
              minlow=scores.get(i);
              lstlow.add(minlow);
          }else if(scores.get(i)>=minlow){
              lstlow.add(minlow);
          }
      }
      for(Integer t:lsthigh) {
    	  System.out.print(t+" ");
      }
      System.out.println(" ");
      for(Integer t:lstlow) {
    	  System.out.print(t+" ");
      }
      System.out.println(" ");
      int best=0;
      int worst=0;
      int previous=0;
      for(int i=1;i<scores.size();i++){
          previous=scores.get(i-1);
          if(previous!=scores.get(i)){
            if(scores.get(i)>=lsthigh.get(i)){
                best++;
            }
            if(scores.get(i)<=lstlow.get(i)){
                worst++;
            }
          }
      }
      resultado.add(best);
      resultado.add(worst);
      System.out.println("best="+best);
      System.out.println("worst="+worst);
      return resultado;
    }
    
    public static List<Integer> breakingRecords2(List<Integer> scores) {
    // Write your code here
     
    int min,max=scores.get(0),cmin=0,cmax=0;
        min=max;
        ArrayList arr=new ArrayList<>();
        for(int i=1;i<scores.size();i++)
        {
        	//System.out.println("contador="+i);
            if(scores.get(i)<min)
            {
                min=scores.get(i);
                ++cmin;
                
            }else if(scores.get(i)>max)
            {
                max=scores.get(i);
                ++cmax;
            }
           else{
               continue;
           }
           //System.out.print("*"+max+","+min+"*");
        }
        arr.add(cmax);
        arr.add(cmin);
        //System.out.println("\n");
        //System.out.println("best="+cmax);
        //System.out.println("worst="+cmin);
        return arr;
    }

}

public class Solution104 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temporal.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = Result104.breakingRecords2(scores);
        List<Integer> result2 = Result104.breakingRecords(scores);
        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
