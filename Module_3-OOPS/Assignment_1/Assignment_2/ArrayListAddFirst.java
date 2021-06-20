/*Q.03

	Write a Java program to insert an element into the array list at the first position.
	
*/


import java.util.*;

class ArrayListAddFirst
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(55);
		list.add(65);
		 System.out.println(list);
		list.add(0,11);				//at first position
		list.add(4,00);				
		System.out.println("======Iterator======");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}


}