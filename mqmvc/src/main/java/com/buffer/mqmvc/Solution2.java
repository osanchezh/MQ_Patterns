package com.buffer.mqmvc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result3 {

    /*
     * Complete the 'minimumMoves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr1
     *  2. INTEGER_ARRAY arr2
     */
/*
	public static int minimumMoves3(List<Integer> arr1, List<Integer> arr2) {
	  int valor1=arr1.get(0);
	  List<Integer> lst1= new ArrayList<Integer>();
	  int maximo=0;
	  for(int i=0;i<valor1;i++) {
		  lst1.add(i);
		  maximo++;
	  }
	  List<Integer> lst2= new ArrayList<Integer>();
	  for(int i=0;i<valor1;i++) {
		  lst1.add(i);	  
	  }
	}
	*/
    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        
    	
    	int moves=0;
    	for(int i=0;i<arr2.size();i++) {
    		if(i<=arr1.size()) {
    	       int valor1=arr1.get(i);
    	       int valor2=arr2.get(i);
    	       
    	       String sv1=String.valueOf(valor1);
    	       String sv2=String.valueOf(valor2);
    	       int times=0;
    	       for(int k=0;k<sv1.length();k++) {
    	    	   int cv1=
    	    	   Integer.parseInt(String.valueOf(sv1.charAt(k)));
    	    	   int cv2=
    	    	   Integer.parseInt(String.valueOf(sv2.charAt(k)));
    	    	   times=cv1-cv2;
        	       //System.out.println(times+",1="+cv1+",2="+cv2);
        	       if(times<0) {
        	    	   times=times*-1;
        	       }
        	       moves+=times;
    	       }
    	       
    	       
    		}
    	}
     
     return moves;
    }

}

public class Solution2 {
	public static void main(String[] args) throws IOException {
		List<Integer> lst1= new ArrayList<Integer>();
		lst1.add(1234);
		lst1.add(4321);
		//lst1.add(6);
		//lst1.add(8);
		
		List<Integer> lst2= new ArrayList<Integer>();
		lst2.add(2345);
		lst2.add(3214);
		//lst2.add(4);
		//lst2.add(2);
		
		
		System.out.println(Result3.minimumMoves(lst1, lst2));
		
	}
    public static void main2(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arr1Count = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < arr1Count; i++) {
            int arr1Item = Integer.parseInt(bufferedReader.readLine().trim());
            arr1.add(arr1Item);
        }

        int arr2Count = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr2Count; i++) {
            int arr2Item = Integer.parseInt(bufferedReader.readLine().trim());
            arr2.add(arr2Item);
        }

        int result = 0;//Result.minimumMoves(arr1, arr2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}