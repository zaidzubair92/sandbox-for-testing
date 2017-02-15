package com.sandbox.serialization;

import java.io.Serializable;


/**
 * Created by zaid.zubair
 */
public class Person implements Serializable
{
	private static final long serialVersionUID = 6634719055000019057L;
	private int id;
	private String name;

	public Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	@Override public String toString()
	{
		return "Person [id=" + id + ", name= " + name + "]";
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
