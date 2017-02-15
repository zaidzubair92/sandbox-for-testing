package com.sandbox.recursion;

/**
 * Created by zaid.zubair
 */
public class TowerOfHanoi
{
	private int cntr = 0;
	public void solve(int numOfDisks, String start, String auxiliary, String end){
		cntr++;
		if(numOfDisks == 1){
			System.out.println(start + " - > " + end);
		}else{
			solve(numOfDisks - 1, start, end, auxiliary);
			System.out.println(start + " - > " + end);
			solve(numOfDisks - 1, auxiliary, start, end);
		}
	}

	public int getCntr()
	{
		return cntr;
	}

	public void setCntr(int cntr)
	{
		this.cntr = cntr;
	}
}
