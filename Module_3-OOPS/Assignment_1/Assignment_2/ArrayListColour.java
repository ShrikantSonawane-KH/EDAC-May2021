/*Q.01

Write a Java program to create a new array list, add some colors (string) and print out the collection


*/


import java.util.*;

class ArrayListColour
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("RED");
		list.add("ORANGE");
		list.add("WHITE");
		 System.out.println(list);
		System.out.println("======Iterator======");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}


}