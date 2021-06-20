/*Q.08

	8. Write a Java program to sort a given array list. 
*/


import java.util.*;

class ArrayListSort
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("ramesh");
		list.add("suresh");
		list.add("gopi");
		list.add("rekha");						
		list.add("shreyas");				
		System.out.println(list);
		System.out.println("=================");
		Collections.sort(list);
		System.out.println(list);
	}

}


