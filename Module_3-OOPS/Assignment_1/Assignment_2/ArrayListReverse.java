/*Q.11

	  Write a Java program to reverse elements in an array list. 
*/


import java.util.*;

class ArrayListReverse
{

	public ArrayList<String> reverseArray (ArrayList<String>  list)
	{
		ArrayList<String> RevArrayList = new ArrayList<String>();
		for(int i=(list.size()-1) ;  i >=0 ;  i-- )
		{
			RevArrayList.add(list.get(i));
		}
		return RevArrayList;
	}

	
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");						
		System.out.println(list);
		System.out.println("=================");
		 ArrayListReverse obj= new  ArrayListReverse();
		list = obj.reverseArray(list);
		System.out.println(list);
	}

}


