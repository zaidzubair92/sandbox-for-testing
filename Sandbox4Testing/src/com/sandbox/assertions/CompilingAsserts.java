package com.sandbox.assertions;

/**
 * Created by zaid.zubair
 */
public class CompilingAsserts
{
	public static void main(String[] args){
		int x = 5;
		assert(9 > 10): x = 6;
		assert (x==6): doStuff();
		System.out.print("end");
	}

	static void doStuff(){

	}
}
