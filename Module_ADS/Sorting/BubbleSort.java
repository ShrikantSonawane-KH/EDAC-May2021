/*
    Bubble Sort:
    + two adjacent elements are to be compaired. 
    + if next element found small --> swap
    + repeat
    + in every pass the largest ele bubbled up at last
    + that means at every i no  of pass, i no element get sorted from last.
    + termination :  (len-1)-i :--> not need to check last element again.
    + to sort n elementd --> n-1 passes are reqired.
    + use flag to check -> if swap is not done for perticular pass-> then break the loop-> no need to check other passes

*/
import java.util.*;
public class BubbleSort {
    
    public void bubble(int[] arr ,int size)
    {   
        for(int i=0;i<size-1 ; i++)                 // for no of passes 
        {
            int flag=0;        
            for(int j = 0; j<size-1-i ; j++)
            {  
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =1;
                }
               
            }
            if(flag == 0)                       // if no single swap happned. then break the out loop..no need to check further
            {
                
                break;
            }

        } 
        display(arr, size); 
    }

    public void display(int[] arr ,int size)
    {
        for(int i =0; i<size;i++)
        {
        System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {

        BubbleSort b = new BubbleSort();
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

        b.bubble(arr , size);
    }
}
