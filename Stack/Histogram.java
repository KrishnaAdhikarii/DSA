

import java.util.Stack;

public class Histogram {
    public static int Largest_rectangle(int[] arr){
        Stack <Integer> s=new Stack<>();
        int max=0;
        for(int i=0;i<=arr.length;i++){
            int curr=(i==arr.length?0:arr[i]);

            while(!s.empty()&&curr<=arr[s.peek()]){
                int h=arr[s.pop()];
                int w=s.empty()?i:i-s.peek()-1;
                max=Math.max(max, h*w);
            }
            s.push(i);

        }
        return max;
    }
    

}

