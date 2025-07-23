package com.buffer.mqmvc.solutions;

public class Fibo {

	public static int fibo(int n) {
		int resultado=0;
		if(n==1 || n==2)
			resultado= 1;
		else
			resultado=fibo(n-1)+fibo(n-2);
		return resultado;
	}
	public static void main(String[] args) {
		System.out.println(fibo(4));

	}

}
