package com.buffer.mqmvc;

class Dividir
{

	public static int division(int x, int y)
	{
		if (x < y){return 0;}

		return 1 + division(x - y, y);
	}

	
	public static int dividir(int x, int y)
	{

		if (y == 0)
		{System.out.printf("no de divisible 0");}


		int firma = 1;
		if (x * y < 0) {firma = -1;}

		return firma * division(Math.abs(x), Math.abs(y));
	}

	public static void main(String[] args)
	{
		int dividendo = 10;
		int divisor = 2;

		System.out.printf("el resultado es %d\n", dividir(dividendo, divisor));
	}
}