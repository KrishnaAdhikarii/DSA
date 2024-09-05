import java.util.*;

public class Searching {
      
    static int linear_search(int[] arr, int p) {
        int n = arr.length;
        if (n<1){
            System.out.println("Element found at index: " + n);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == p) {
                System.out.println("Element found at index: " + (i + 1));
                return 0; // If you want to return the index, use "return i + 1;"
            }
        }
        System.out.println("Element not found");
        return 0;
    }

    static int Binary_search(int[] arr,int p,int High,int Low){
        int n=arr.length;
        if (n<1){
            System.out.println("Element found at index: " + n);
        }
        int mid=(High+Low)/2;
        if (mid==p){
            System.out.println("Element found at index: " + (mid));
        }
        else if (p<mid){
            Binary_search(arr, p, mid, Low);
        }
        else{
            Binary_search(arr, p, High, mid+1);
        }
        return 0;
        }
    

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int x = sc.nextInt();
        linear_search(arr, x);
        System.out.println("Binary ");
        Binary_search(arr, x, size, 0);
        sc.close();
    }
}
