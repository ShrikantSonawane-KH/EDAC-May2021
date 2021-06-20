/*Q.04

	Write a Java program to retrieve an element (at a specified index) from a given array list.

*/


import java.util.*;

class ArrayListGet
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(55);
		list.add(65);
		 System.out.println(list);
		list.add(0,11);				//at first position
		list.add(4,10);				
		
		System.out.println(list.get(3));			// get element at index 3
		System.out.println("======Iterator======");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}


}