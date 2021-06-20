/*Q.05

	 Write a Java program to update specific array elements by a given element. 


*/


import java.util.*;

class ArrayListSet
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
		list.set(3,33);
		System.out.println("Upadting position 3: ");
		System.out.println(list);
	}

}


