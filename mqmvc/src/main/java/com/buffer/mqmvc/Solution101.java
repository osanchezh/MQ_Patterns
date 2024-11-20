package com.buffer.mqmvc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result101 {

    /*
     * Complete the 'demandingMoney' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY money
     *  2. 2D_INTEGER_ARRAY roads
     */

    public static List<Integer> demandingMoney(List<Integer> money, List<List<Integer>> roads) {
    // Write your code here
    int[] moneyi= new int[money.size()];
 for(int i=0;i<money.size();i++){
     moneyi[i]=money.get(i);
 }
    int[][] arr = new int[roads.size()][];
// iterate through the array rows
for (int i = 0; i < arr.length; i++) {
    // initialize the row of the array,
    // specify the number of elements
    arr[i] = new int[roads.get(i).size()];
    // iterate through the elements of the row
    for (int j = 0; j < arr[i].length; j++) {
        // populate the array
        arr[i][j] = roads.get(i).get(j);
    }
}
      long[] resultado=demandingMoney2(moneyi,arr);
      List<Integer> rest= new ArrayList<Integer>();
      for(int i=0;i<resultado.length;i++){
          rest.add(new Long(resultado[i]).intValue());
          System.out.println(rest.get(i));
      }
      return rest;
    }

    private static long maxMoney = Integer.MIN_VALUE;
    private static Map<Long, Long> solutions;
    private static Set<Integer>[] graph;
    private static int[] moneys;
    
    static long[] demandingMoney2(int[] inputMoneys, int[][] roads) 
    {
        if (inputMoneys == null || inputMoneys.length == 0)
        {
            return new long[] {0, 0};
        }
        
        int n = inputMoneys.length;
        moneys = inputMoneys;
        graph = new Set[n+1];
        solutions = new HashMap<>();
    
        for (int i = 1; i <= n; i++)
        {
            graph[i] = new HashSet<>();
        }
        
        for (int[] road : roads)
        {
            int max = road[0] > road[1] ? road[0] : road[1];
            int min = road[0] > road[1] ? road[1] : road[0];
            graph[min].add(max);
            
            graph[min].add(min);
            graph[max].add(max);
        }
        
        Set<Integer> visited = new HashSet<>();
        int soloMoney = 0;
        int zeroCount = 0;
        
        for (int i = 1; i <= n; i++)
        {
            if (graph[i].size() == 0)
            {
                visited.add(i);
                soloMoney += moneys[i-1];
                zeroCount += moneys[i-1] == 0 ? 1 : 0;
            }
        }
        
        solutions.put(0L, 1L);
        for (int start = 1; start <= n; start++)
        {
            if (!visited.contains(start))
            {
                search(start, visited, 0L);
            }
        }
        
        long result = soloMoney;
        long count = 1;
        
        for (int i = 0; i < zeroCount; i++)
        {
            count *= 2L;
        }
        
        if (maxMoney != Integer.MIN_VALUE)
        {
            count *= solutions.get(maxMoney);
            result += maxMoney;
        }
        
        return new long[] { result, count };
    }
    
    private static void search(int start, Set<Integer> visited, long totalMoney)
    {
        totalMoney += moneys[start-1];
        //Long valor1=solutions.getOrDefault(totalMoney, 0L);
        Long valor1=solutions.get(totalMoney);
        if(valor1==null) {
        	valor1=0L;
        }
        //System.out.println("valor1="+valor1);
        solutions.put(totalMoney,  valor1+ 1L);
        maxMoney = Math.max(maxMoney, totalMoney);
        
        Set<Integer> removed = new HashSet<>();
        for (int neighbor : graph[start])
        {
            if (!visited.contains(neighbor))
            {
                visited.add(neighbor);
                removed.add(neighbor);
            }
        }
        
        for (int next = start+1; next <= moneys.length; next++)
        {
            if (visited.contains(next))
            {
                continue;
            }
            
            search(next, visited, totalMoney);
        }
        
        visited.removeAll(removed);
    }
}

public class Solution101 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temporal.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] moneyTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> money = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int moneyItem = Integer.parseInt(moneyTemp[i]);
            money.add(moneyItem);
        }

        List<List<Integer>> roads = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] roadsRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> roadsRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int roadsItem = Integer.parseInt(roadsRowTempItems[j]);
                roadsRowItems.add(roadsItem);
            }

            roads.add(roadsRowItems);
        }

        List<Integer> result = Result101.demandingMoney(money, roads);

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