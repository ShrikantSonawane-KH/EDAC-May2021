/*Q.06

	  Write a Java program to remove the third element from an array list. 

*/


import java.util.*;

class ArrayListRemove
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(55);
		list.add(65);
		list.add(0,11);						
		list.add(4,10);				
		System.out.println(list);
		System.out.println("=================");
		list.remove(3);
		System.out.println(list);
	}

}


