public class Insertion_Sort {
    public static void Insertion_sort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            while (j>=0){

                if(arr[j]>arr[j+1]){
                  Swap.Swap(arr, j, j+1);
  
                }
                else{
                    break;
                }
                j--;
            }
        }
        System.out.println("Insertion Sort");
        for(int p=0;p<n;p++){
        System.out.print( arr[p]+"  ");
        }
    }
   
}
