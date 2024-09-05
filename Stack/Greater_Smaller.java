
import java.util.Stack;

public class Greater_Smaller {
    public static int[] Greater(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        for(int i=1;i<n;i++){
            while (!s.empty()&&arr[i]>=s.peek()) {
                s.pop();                
            }
            if(s.empty()){
                result[i]=-1;
            }
            else{
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return result;
    }

    public static int[] Smaller(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        for(int i=1;i<n;i++){
            while (!s.empty()&&arr[i]<=s.peek()) {
                s.pop();                
            }
            if(s.empty()){
                result[i]=-1;
            }
            else{
                result[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return result;
    }


    
}
