
import java.util.Scanner;
import java.util.Stack;

public class Stock_span {
    public static int[] Calculate_Stack(int[] arr){
        int n=arr.length;
        int[] spans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.empty()&&arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            spans[i]=stack.empty()?i+1:i-stack.peek();
            stack.push(i);

        }
        return spans;
    }
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of Elements");
    int n =sc.nextInt();
    int[] arr=new int[n];
    for(int j=0;j<n;j++){
        arr[j]= sc.nextInt();
    }

    int[] result =Calculate_Stack(arr);
    for(int element:result){
        System.out.print(element+" ");
    }
sc.close();
}


}

