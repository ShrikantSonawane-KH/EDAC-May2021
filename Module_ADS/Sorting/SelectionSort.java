/* 
    Selection Sort:
    
    + divide the array in sorted & unsorted manner.
    + update min variable if the next element is small. go and search for min in array
    + replace that found element with resp. i th position.
    + repeat

*/

import java.util.Scanner;

class SelectionSort
{
   public void SelectSort (int[] arr , int size)
    {
        for(int i = 0; i<size-1;i++)                // for passes
        {
            int min = i;
            for(int j = i+1 ; j < size;j++ )        // search for the min element
            {
                if(arr[j]<arr[min])                  
                {   
                    min=j;
                }
                
            }                                       // at the end we get the smallest ele for array
            int temp = arr[min];                    // replace that smallest element with resp. i position element 
            arr[min]= arr[i];
            arr[i]=temp;

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
    
    SelectionSort s = new SelectionSort();
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

        s.display(arr, size); 
        System.out.println();
        System.out.println("================sorted==================");

        s.SelectSort(arr , size);             
}

}