import java.util.Scanner;
public class Sorting{
    public static void main(String[] Args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter No of Elements:");
    int n=sc.nextInt();
    int[] arr =new int[n];
    System.out.println("Enter Elements");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    // Bubble_Sort.Bubble_sort(arr);
    // Selection_sort.Selection_sort(arr);
    // Insertion_Sort.Insertion_sort(arr);
    // Merge_Sort.Merge_sort(arr);
    // Quick_Sort.Quick_sort(arr);
    Count_Sort.CountSort(arr);
    // radixSort.RadixSort(arr);
    
    

    sc.close();}
}