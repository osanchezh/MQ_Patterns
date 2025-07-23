package com.buffer.mqmvc.solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    	//int contador=0;
    	
    	ArrayList<Integer> lst= new ArrayList<Integer>(0);
    	for(int i=0;i<a.size();i++) {
           int valor=a.get(i);
           int j=0;
           j=j+1;
           if(j<=a.size()) {
        	 if(valor%a.get(j)==0) {
        		 if(!lst.contains(a.get(j))) {
        		   lst.add(a.get(j));
        		   System.out.println(a.get(j));
        		 }
        		 
        	 }  
           }
    	}
        int menor=a.get(a.size()-1);
        int mayor=b.get(b.size()-1);
    	
        for(int i=menor;i<=mayor;i++) {
        	int replica=0;
        	for(int j=0;j<b.size();j++) {
        		if(b.get(j)%i==0&&b.get(j)!=i) {
           		 if(!lst.contains(i)) {
          		   lst.add(i);
          		   System.out.println(i);
          		 }        		
        		}
        	}
        }
        System.out.println("----------------");
        ArrayList<Integer> lst1= new ArrayList<Integer>(0);
        for(int i=0;i<lst.size();i++)
        {
        	int replica=0;
        	for(int j=0;j<b.size();j++) {
        		//System.out.println("b="+b);
        		//System.out.println("j="+j);
        		//System.out.println("i="+i);
        		if(b.get(j)%lst.get(i)==0) {
        			replica++;
        			//System.out.println(replica);
        		}
        	}
        	//System.out.println("--------1--------");
        	if(replica>=b.size()) {
          		 //if(!lst.contains(i)) {
            		  
            		if(!lst1.contains(lst.get(i))) {
            			lst1.add(lst.get(i));
            		      System.out.println(lst.get(i));
            		}
                  //}  
        	}
        }
    	return lst1.size();
    }

}

public class Solution111 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temporal1.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
