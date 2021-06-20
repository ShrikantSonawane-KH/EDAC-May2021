/*

	Array:
	
	insertion, delete, search, dsplay.
	
*Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. 

In Java, array is an object of a dynamically generated class. Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces. We can store primitive values or objects in an array in Java. Like C/C++, we can also create single dimentional or multidimentional arrays in Java.	

Advantages

    Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
    Random access: We can get any data located at an index position.

Disadvantages

    Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.


There are two types of array.

    Single Dimensional Array
    Multidimensional Array


*Single Dimensional Array:

declaration: 
    dataType[] arr; (or)  
    dataType []arr; (or)  
    dataType arr[];  

declare and initialization:
int a[]=new int[5];
int a[]={33,3,4,5};
new int[]{10,22,44,66};---> anonimous array

* Multidimensional Array in Java

dataType[][] arrayRefVar; (or)  
dataType [][]arrayRefVar; (or)  
dataType arrayRefVar[][]; (or)  
dataType []arrayRefVar[];

declare and initialization:
int[][] arr=new int[3][3];
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  


*Jagged Array in Java : it is an array of arrays with different number of columns. 

*Arrays class: present in java.util

The Arrays class in java.util package is a part of the Java Collection Framework. This class provides static methods to dynamically create and access Java arrays. It consists of only static methods and the methods of Object class. The methods of this class can be used by the class name itself.

*/

import java.util.*;

class ArrayADSDemo
{
	public static void main(String[] args)
	{
		ArrayADSDemo A =  new ArrayADSDemo();
		
		int[] a;
		
		a = new int[100];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		a[9]=100;
		
		for (int i = 0 ; i<10 ; i++)
		{
			System.out.println("a["+i+"]: "+a[i]);
		}
		
		System.out.println("===============Search=================");
		
		System.out.println(" Enter to key : ");
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		int flag = 0;
		
		for (int i = 0 ; i<10 ; i++)
		{
			if( a[i] == key)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println(" Congo..!! key found ");
		else 
			System.out.println(" Sorry ..!! try again ");
	
		System.out.println("===============Deletion=================");
	
		System.out.println(" Enter to key : ");
	
		int key1 = sc.nextInt();
		
		/*
		int cnt=0;
		
		for (int i = 0 ; i<10 ; i++)
		{
			
			if(a[i]== key1)
			{
				break;
			}
			cnt++;
		}
		
		for (int j = cnt ; j<10 ; j++)
		{
			a[j]=a[j+1];
		}
		for (int i = 0 ; i<10-1 ; i++)
		{
			System.out.println("a["+i+"]: "+a[i]);
		}
		*/
	int k=0;
	for (int i = 0 ; i<10 ; i++)
		{
			
			if(a[i]== key1)
			{
				continue;
			}
			a[k] = a[i];
			k++;
		}
		
		for (int i = 0 ; i< 10-1 ; i++)
		{
			System.out.println("a["+i+"]: "+a[i]);
		}
	
	
	
	}

}




/*

Properties of the Array

    Each element is of same data type and carries a same size i.e. int = 4 bytes.
    Elements of the array are stored at contiguous memory locations where the first element is stored at the smallest memory location.
    Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of data element.

Need of using Array

In computer programming, the most of the cases requires to store the large number of data of similar type. To store such amount of data, we need to define a large number of variables. It would be very difficult to remember names of all the variables while writing the programs. Instead of naming all the variables with a different name, it is better to define an array and store all the elements into it. 





*/