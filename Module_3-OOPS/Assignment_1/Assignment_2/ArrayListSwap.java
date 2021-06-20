/*Q.14

	Write a Java program of swap two elements in an array list. 
	public static void swap(List list, int a, int b);

*/

import java.util.*;
class ArrayListSwap
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
		Collections.swap(list,0,6);
		System.out.println(list);
	}

}


