package com.buffer.mqmvc.solutions;

public class RediMix extends Concrete {

	RediMix(){
		System.out.print("r ");
	}
	
	public static void main(String[] args) {
		new RediMix();

	}

}

class Concrete extends Sand{
	Concrete(){
		
		System.out.print("c ");
	}
	private Concrete(String s) {
		
	}
}

abstract class Sand{
	Sand(){
		System.out.print("s ");
	}
}
