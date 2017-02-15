package com.sandbox.collections;

import java.util.*;


/**
 * Created by zaid.zubair
 */
public class HashMapTutorial
{
	public static void main(String[] args){
		/**
		 * HashMap does not maintain order
		 * If you use a custom type for a key, you must override the equals() and hashCode() methods.
		 * Unordered
		 */
		Map<Identifier, String> map = new HashMap<>();

		map.put(new Identifier(8,"eight"), "eight");
		map.put(new Identifier(9,"nine"), "nine");
		map.put(new Identifier(5,"five"), "five");
		map.put(new Identifier(6,"six"), "six");
		map.put(new Identifier(10,"ten"), "ten");
		map.put(new Identifier(7,"seven"), "seven");

		for(Identifier number : map.keySet()){
			System.out.println(map.get(number));
		}

		/**
		 * LinkedHashMap are used to keep order of entries in the map
		 */
		Map<Identifier, String> linkedMap = new LinkedHashMap<>();

		linkedMap.put(new Identifier(88,"88"), "eighty eight");
		linkedMap.put(new Identifier(99,"99"), "ninety nine");
		linkedMap.put(new Identifier(55,"55"), "fifty five");
		linkedMap.put(new Identifier(66,"66"), "sixty six");
		linkedMap.put(new Identifier(1010,"1010"), "thousand ten");
		linkedMap.put(new Identifier(77,"77"), "seventy seven");

		for(Map.Entry<Identifier,String> number : linkedMap.entrySet()){
			System.out.println("key= " + number.getKey() + ", value= " + number.getValue());
		}

		Map<Identifier, String> treeMap = new TreeMap<>();

		treeMap.put(new Identifier(88,"88"), "eighty eight");
		treeMap.put(new Identifier(99,"99"), "ninety nine");
		treeMap.put(new Identifier(55,"55"), "fifty five");
		treeMap.put(new Identifier(66,"66"), "sixty six");
		treeMap.put(new Identifier(1010,"1010"), "thousand ten");
		treeMap.put(new Identifier(77,"77"), "seventy seven");
	}

}

class Identifier{
	public int id;
	public String name;

	public Identifier(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override public int hashCode()
	{
		return Objects.hash(id,name);
	}

	@Override
	public boolean equals(Object o) {

		if (o == this) return true;
		if (!(o instanceof Identifier)) {
			return false;
		}
		Identifier identifier = (Identifier) o;
		return id == identifier.id &&
				Objects.equals(name, identifier.name);
	}
}
