package com.buffer.mqmvc;

import java.util.ArrayList;
import java.util.List;

public class Duplicados {

	
	public static int countDuplicates(List<Integer> lst1) {
		int contador1=0;
		int contador2=0;
		for(int x=0;x<lst1.size();x++) {
			for(int y=0;y<lst1.size();y++) {
				if(x==y) {
					if(contador1>1) {
					  contador2++;
					}
					contador1++;
				}
			}
		}
		return contador2;
	}
	public static void main(String[] args) {

		List<Integer> lst1= new ArrayList<Integer>();
		lst1.add(1);
		lst1.add(2);
		lst1.add(4);
		lst1.add(3);
		
		System.out.println(countDuplicates(lst1));

	}

}
