 public class Bubble_Sort {
 
    
 
 static void Bubble_sort(int[] arr){
    int n= arr.length;
    for (int i=1;i<n;i++){
    for (int j=0;j<n-i;j++){
        if (arr[j]>arr[j+1]){
            Swap.Swap(arr,j,j+1);
        }
    }
}
System.out.println("Bubble Sort:");
for (int a=0;a<n;a++){
    System.out.print(arr[a]+"   ");

}
}
 }