package com.buffer.mqmvc;

public class IntegerToRoman   
{  
	public static void romano(int num)   
	{  
			System.out.println("ENTERO: " + num);  
			int[] VALORES = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
			String[] LETRAS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
			StringBuilder ROMANO = new StringBuilder();  
			for(int i=0;i<VALORES.length;i++)   
			{  
					while(num >= VALORES[i])   
					{  
						num = num - VALORES[i];  
						ROMANO.append(LETRAS[i]);  
					}  
			}  
			System.out.println("ROMANO: " + ROMANO.toString());  
	}  
public static void main(String args[])   
{  
	romano(125);  
	romano(252);  
	romano(1000);  
	romano(1010);  
}  
}  