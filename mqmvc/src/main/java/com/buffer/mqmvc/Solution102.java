package com.buffer.mqmvc;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result102 {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents2(List<Integer> grades) {
        List<Integer> updatedGrades = new ArrayList<Integer>();
          int length = grades.size();
          for (int i = 0; i < length; i++) {
              int grade = grades.get(i);
              int checkGradeMultiple = grade % 5;

              if (grade == 100 || grade < 38) {
                  updatedGrades.add(grade);
              } else {
                  if (checkGradeMultiple >= 3) {
                      updatedGrades.add(grade + (5 - checkGradeMultiple));
                  } else {
                      updatedGrades.add(grade);
                  }
              }

          }
        return updatedGrades;
      }
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> lst = new ArrayList<Integer>();
        for(int i=0;i<=20;i++){
            lst.add(i*5);
            //System.out.println(">"+(i*5));
        }
        LinkedHashMap<Integer,Integer> mapa= new LinkedHashMap<Integer,Integer>();
        for (int i = 0; i < grades.size(); i++) {
            mapa.put(grades.get(i), 0);
            //System.out.println("Mapa.1="+grades.get(i));
        }
        int size= lst.size();
        //System.out.println("SIZE.1="+size);
         List<Integer> resultado = new ArrayList<Integer>();
        for(int i=0;i<lst.size();i++){
            for(int j=0;j<grades.size();j++){
                int max=0;
                if((i+1)>=size){
                    max=size-1;
                    //System.out.println("BAJA, SIZE="+size);
                }else{
                    max=i+1;
                }
                //System.out.println("i="+i+",max="+max);
               // System.out.println("COMPARAR="+lst.get(i)+"-"+grades.get(j)+"-"+lst.get(max)+"-"+grades.get(j));
                if(lst.get(i)<=grades.get(j)&&lst.get(max)>grades.get(j)){
                	System.out.println(">>>>COMPARAR="+lst.get(i)+"-"+grades.get(j)+"-"+lst.get(max)+"-"+grades.get(j));
                      int calificacion=0;
                	  if(grades.get(j)<=37){
                		  calificacion=grades.get(j);
                       }else{
                    	   int resta=lst.get(max)-grades.get(j);
                    	   if(resta<3){
                    		   calificacion=lst.get(max);
                    	   }else{
                    		   calificacion=grades.get(j);
                       }
                    }
                	  
                    //resultado.add(calificacion);
                    if(mapa.containsKey(grades.get(j))) {
                    	mapa.put(grades.get(j), calificacion);
                    }
                }else if(grades.get(j)>=100) {
                	//System.out.println(">>>>COMPARAR="+grades.get(j));
                	mapa.put(grades.get(j), 100);
                }
            }
        }
  
        //for (Map.Entry<Integer, Integer> e : mapa.entrySet()){
        //	resultado.add(e.getValue());
        //	System.out.println("mapa2="+e.getKey()+"-"+e.getValue());
        //}
        
        for (int i = 0; i < grades.size(); i++) {
        	//System.out.println("grades.get(i)="+grades.get(i));
        	if(mapa.containsKey(grades.get(i))) {
        		resultado.add(mapa.get(grades.get(i)));
        		//System.out.println("grades.get(i)="+grades.get(i));
        	}
        }
        
       // for (int i = 0; i < resultado.size(); i++) {
        	//System.out.println(""+resultado.get(i));
        //}
        return resultado;
    }

}

public class Solution102 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temporal.txt"));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result102.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

