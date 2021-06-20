/*Q.09

	Write a Java program to copy one array list into another.
*/


import java.util.*;

class ArrayListCopy
{
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");						
		System.out.println(list1);
		System.out.println("=================");
		//ArrayList list2 = new ArrayList<String>(list1);		//Method 1 - both are separate copy
		
		/*
		ArrayList list2 = list1;					// Method 2 - both  share single copy
		list2.add("N");	
		System.out.println(list2);
		System.out.println(list1);
		*/
		
		ArrayList list2 = new ArrayList<String>();			//Method 3 - both are separate copy
		
		for(String s : list1)
		{
			list2.add(s);		
		}
		System.out.println(list2);
	}

}


