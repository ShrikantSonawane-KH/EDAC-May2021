/*Q.10

	 Write a Java program to shuffle elements in an array list. 
*/


import java.util.*;

class ArrayListShuffle
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");						
		System.out.println(list);
		System.out.println("=================");
		
		Collections.shuffle(list);			//Method 1 
		System.out.println(list);
		System.out.println("=================");	
	}

}


