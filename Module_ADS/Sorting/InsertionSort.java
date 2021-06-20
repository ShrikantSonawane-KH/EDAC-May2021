/*
    Insertion Sort: insertion of ele is done here -> divided to sorted sublist and unsorted sublist.
    +at start -> cosidder left most ele in sorted sublist.
    +compare next ele with that ele-> and place the next ele in appropriate place in sorted sublist.

*/

import java.util.*;
public class InsertionSort {

    public void insertion(int[] arr,int size)
    {
        for(int i=1;i<size;i++)               // i=1: bcz we considering the first ele is sorted at first
        {
            int temp = arr[i];
            int  j=i-1;
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }   
            arr[j+1]=temp;                      
        }
        display(arr,size);
    }
    public void display(int[] arr ,int size)
    {
        for(int i =0; i<size;i++)
        {
        System.out.print(arr[i]+" ");
        }

    }


    public static void main(String[] args) {
        InsertionSort b = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("enter the element of array : ");
        for(int i =0; i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("================un-sorted==================");

        b.display(arr, size); 
        System.out.println();
        System.out.println("================sorted==================");

        b.insertion(arr, size);
    
    }
    
}
