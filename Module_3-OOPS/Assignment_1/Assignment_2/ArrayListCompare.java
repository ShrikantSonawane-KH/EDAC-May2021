/*Q.13

	 Write a Java program to compare two array lists. 

*/


import java.util.*;

class ArrayListCompare
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
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);	// making separate copy
		System.out.println(list2);
		System.out.println("========================");
		boolean var = list.equals(list2);
		System.out.println("Equality check:  Before :-->"+ var+"  "+ list);
		list2.add(7);
		boolean var1 = list.equals(list2);
		System.out.println("Equality check:  After :-->"+ var1+"  "+ list2);
	}

}


