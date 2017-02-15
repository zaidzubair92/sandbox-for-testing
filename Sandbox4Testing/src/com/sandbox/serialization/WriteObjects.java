package com.sandbox.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


/**
 * Created by zaid.zubair
 */
public class WriteObjects
{public static void main(String args[]){
	System.out.println("Writing objects...");

	Person[] ppl = {new Person(1,"ace"), new Person(2, "bob"), new Person(3, "cat")};

	try(FileOutputStream fileOutputStream = new FileOutputStream("people.xml"))
	{
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(ppl);
		objectOutputStream.close();
	}
	catch (FileNotFoundException e){
		e.printStackTrace();
	}
	catch (IOException e){
		e.printStackTrace();
	}
}

}
