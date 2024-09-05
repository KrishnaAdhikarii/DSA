public class Quick_Sort {
    public static void Quick_sort(int[] arr){
        int n =arr.length;
        Qsort(arr,0,n-1);
        System.out.println("Quick Sort:");
        for(int element:arr){
            System.out.print(element+" ");
        }


    }
    private static void Qsort(int[] arr ,int low ,int high){
        if(low<high){
            int pIndex=Split(arr,low,high);
            Qsort(arr,low,pIndex-1);
            Qsort(arr, pIndex+1, high);
            }
        }
    
    private static int Split(int[] arr,int low,int high){
        int i=low-1;
        int pivot=arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                Swap.Swap(arr, i, j);
            }

        }
        Swap.Swap(arr, i+1, high);        
        return i+1;

    }

}
