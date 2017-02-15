package com.sandbox.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by zaid.zubair
 */
public class LinkedListTutorial
{
	public static void main(String[] args)
	{
		/**
		 * ArrayLists manage arrays internally.
		 * [0][1][2][3][4]...
		 *
		 * ArrayList are very fast for adding items to the end (or near the end) of the list
		 * ArrayList are very slow for adding items to the beginning of the list
		 */
		List<Integer> arrayList = new ArrayList<>();

		/**
		 * LinkedLists consists of elements where each element
		 * has a reference to the previous and next element
		 * [0] -> [1] -> [2] -> [3]...
		 *     <-     <-     <-
		 * LinkedList are very fast for adding items to the end (or near the end) of the list
		 * LinkedList are very fast for adding items to the beginning of the list
		 */
		List<Integer> linkedList = new LinkedList();

		doTimings("ArrayList", arrayList);
		doTimings("ListedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list){

		long startAdd = System.currentTimeMillis();

		//Adding 10^6 items to the end of the list
		for (int i = 0; i <1E6; i++){
			list.add(i);
		}

		System.out.println("Time taken: " + (System.currentTimeMillis() - startAdd) + "ms for " + type);

		long startRemove = System.currentTimeMillis();

		//Adding 10^6 items to the beginning of the list
		for (int i = 0; i <1E6; i++){
			list.add(0,i);
		}

		System.out.println("Time taken: " + (System.currentTimeMillis() - startRemove) + "ms for " + type);

	}
}
