/*
    merge sort: devide and Conqure

*/



public class mergeSort {
    
    void MergeSubArray(int arr[], int l, int mid, int r)
	{
        int n1 = mid-l+1;
        int n2 = r-mid;
         
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++)
        {
            L[i]=arr[l+i];
        }

        for(int j=0;j<n2;j++)
        {
            R[j]=arr[(mid+1)+j];
        }
        // merge logic 

        int i=0,j=0;
        int k =l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k]=L[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=R[j];
                j++;
                k++;
            }

        }

        while(i<n1)
        {
            arr[k]=L[i];
            k++;
            i++;
        }
        while(j<n2)
        {
            arr[k]=R[j];
            k++;
            j++;
        }
	}

    public void display(int[] arr, int r)
    {
        for(int q =0; q<r-1;q++)
        {
            System.out.println(arr[q]);
        }
    }

    public void MergeSort(int[] arr, int l, int r)
    {
        if(l<r)
        {
           
            int mid = l+(r-l)/2;
            
            //left subArray
            MergeSort(arr ,l ,mid);

            //right sunArray
            MergeSort(arr ,mid+1 ,r);

            MergeSubArray(arr ,l,mid,r);
        }

    }
/*
    public void MergeSubArray(int[] arr, int l, int mid, int r)
    {
        System.out.println("MergeSubArray");
        int i = l;
        int j=mid+1;
        int k = l; 
        int len = r-l;
        int[] temp = new int[len];    
        while(i<=mid && j<=r)
        {
            
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                temp[k]=arr[j];
                k++;
                j++;
            }
        }    
        
        
            
            while(j<=r)
            {
                System.out.println("vvvv");
                temp[k] = arr[j];
                k++;
                j++;
            }
                        
            while(i<=mid);////////////////////
            {
                temp[k] = arr[i];
                i++;
                k++;
            }
            
        
        }
        */
   public static void main(String[] args) {
    mergeSort  m = new mergeSort();  

    int[] arr = {12,11,13,5,6,7};
    System.out.println("main");
    int len = arr.length;
    //System.out.println(len);
    m.MergeSort(arr, 0, len-1);
    m.display(arr, len);
  }
}
