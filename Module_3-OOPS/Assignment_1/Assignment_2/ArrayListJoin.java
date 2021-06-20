/*Q.15
	Write a Java program to join two array lists. 	
*/

import java.util.*;
class ArrayListJoin
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);						
		System.out.println(list);
		System.out.println("========================");
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list.addAll(list2);				//Method 1
		

		ArrayList<Integer> list3 = new ArrayList<Integer>();


		System.out.println(list);
	}

}


