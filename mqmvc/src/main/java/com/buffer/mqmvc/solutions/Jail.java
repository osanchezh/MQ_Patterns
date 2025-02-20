package com.buffer.mqmvc.solutions;

public class Jail {
    private int x=4;
    public static void main(String[] args) {
    //new Jail().new Cell.slam();
    	
    	Jail j=new Jail();
    	
    }
    class Cell{
    	void slam() {
    		System.out.println("throw away key"+x);
    	}
    }
}
