package com.buffer.mqmvc;

public class Bunnies {
	static int coun=0;
	Bunnies(){
		while(coun<10) new Bunnies(++coun);
	}
	Bunnies(int x){
		super();
	}
	
	public static void main(String[] args) {
		new Bunnies();
		new Bunnies(coun);
		System.out.println(coun++);

	}

}
