import java.util.Scanner;


public class STACK1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of Elements");
    int n =sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter Elements");

    for(int j=0;j<n;j++){
        arr[j]= sc.nextInt();
    }
    System.out.println("Elements :");

    for(int element:arr){
        System.out.print(element+" ");
    }
    System.out.println();
    System.out.println("RESULT:");
    System.out.println("Smaller:");


    int[] result =Greater_Smaller.Smaller(arr);
    // int res=Histogram.Largest_rectangle(arr);
    // System.out.println("Output:"+res);
    for(int element:result){
        System.out.print(element+" ");
    }
    System.out.println();
    System.out.println("Greater:");

    int[] result1 =Greater_Smaller.Greater(arr);
    // int res=Histogram.Largest_rectangle(arr);
    // System.out.println("Output:"+res);
    for(int element:result1){
        System.out.print(element+" ");
    }
sc.close();
}
    
}
