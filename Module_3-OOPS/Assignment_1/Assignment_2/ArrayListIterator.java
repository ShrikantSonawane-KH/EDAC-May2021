/*Q.02

	Write a Java program to iterate through all elements in an array list. 
*/


import java.util.*;

class ArrayListIterator
{
	public static void main(String[] args)
	{
		ArrayList<Float> list = new ArrayList<Float>();
		list.add(45.01f);
		list.add(55.60f);
		list.add(88.06f);
		 System.out.println(list);
		System.out.println("======Iterator======");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}


}