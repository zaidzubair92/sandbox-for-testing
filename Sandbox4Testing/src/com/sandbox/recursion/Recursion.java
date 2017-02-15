package com.sandbox.recursion;

/**
 * Created by zaid.zubair
 */
public class Recursion
{
	public void run(){
		final int  x = 5;

		calc(x);
	}

	public void calc(int x){
		if(x == 0){
			return;
		}
		calc(x - 1);
		System.out.println(x);
	}
}
