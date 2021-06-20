/*Q.12

	 Write a Java program to extract a portion of an array list.

* IndexOutOfBoundsException – if an endpoint index value is out of range (fromIndex size)
*IllegalArgumentException – if the endpoint indices are out of order (fromIndex > toIndex)
*
*/


import java.util.*;

class ArrayListSubList
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
		System.out.println("=================");
	//	ArrayList<Integer> list2 = list.subList(1,4); 	// List<Integer> cannot be converted to ArrayList<Integer>
		List<Integer> list2 = list.subList(1,5); 		

		System.out.println(list2);
	}

}


