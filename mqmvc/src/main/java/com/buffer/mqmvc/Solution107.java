package com.buffer.mqmvc;

import java.util.ArrayList;
import java.util.List;

public class Solution107 {
	public int maxProfit(int[] prices) {
		int valor = 0;
		int menor = -1;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				valor = (prices[j] - prices[i]);
				if (valor > 0) {
					if ((menor == -1) || (menor < valor)) {
						menor = valor;
					}
				}
			}
		}

		return menor < 0 ? 0 : menor;
	}

	public int maxProfit5(int[] prices) {
		int valor = 0;
		int menor = -1;
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			if ((max + 1) >= prices.length) {
				max = prices.length - 1;
			} else {
				max++;
			}
			if (i != max) {
			valor = (prices[max] - prices[i]);
			
			System.out.println("i="+i+",max="+max+ ",valor="+valor);
				if (valor > 0) {
					if ((menor == -1) || (menor > valor)) {
						menor = valor;
					}
				}
			}

		}

		return menor < 0 ? 0 : menor;
	}

	public int maxProfit4(int[] prices) {
		int ans = 0, mi = prices[0];
		for (int v : prices) {
			
			ans = Math.max(ans, v - mi);
			mi = Math.min(mi, v);
			
			System.out.println("ans="+ans+",mi="+mi);
		}
		return ans;
	}

	public int maxProfit3(int[] prices) {
		int valor = 0;
		int menor = -1;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				valor = (prices[j] - prices[i]);
				if (menor == -1 && valor > 0) {
					menor = valor;
				}
				if (menor < valor && valor > 0) {
					menor = valor;
				}
			}
		}
		if (menor < 0) {
			menor = 0;
		}
		return menor;
	}

	public int maxProfit2(int[] prices) {
		int valor = 0;
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				valor = (prices[j] - prices[i]);
				if (valor >= 0) {
					lst.add(valor);
				}
			}
		}
		int menor = lst.isEmpty() ? 0 : lst.get(0);
		for (Integer i : lst) {
			if (menor < i)
				menor = i;
		}
		return menor;
	}

	// System.out.println("prices[j]="+prices[j]+","+"prices[i]="+prices[i]+",valor="+(prices[j]-prices[i]));

	public static void main(String[] args) {
		int prices[] = new int[] { 7, 1, 5, 3, 6, 4 };
		int prices2[] = new int[] { 7, 6, 4, 3, 1 };
		Solution107 s = new Solution107();
		int valor = s.maxProfit4(prices);
		System.out.println(valor);
	}

}
