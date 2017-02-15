package com.sandbox.serialization;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 * Created by zaid.zubair
 */
public class ReadObjects
{
	public static void main(String args[]){
		System.out.println("Reading objects...");

		try(FileInputStream fileInputStream = new FileInputStream("people.xml"))
		{
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Person[] ppl = (Person[]) objectInputStream.readObject();
			objectInputStream.close();

			System.out.println(ppl[0]);
			System.out.println(ppl[1]);
			System.out.println(ppl[2]);
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
