public class Selection_sort {
    

    public static void Selection_sort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    Swap.Swap(arr, i, j);
                }
            }
        }
        System.out.println("Selection Sort:");

            for (int a=0;a<n;a++){
            System.out.print(arr[a]+"   ");
        
        }
    }
}
