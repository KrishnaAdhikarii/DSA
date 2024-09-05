import java.util.Stack;

public class LargestRectangle0f1s {

    public static int calculate_rect(char[][] arr){
        if(arr==null||arr.length<1||arr[0].length<1){
            return 0;
        }
        int[] heights=new int[arr[0].length];
        int maxarea=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='1'){
                    heights[j]+=1;
                }
                else{
                    heights[j]=0;
                }

            }
             maxarea=Math.max(maxarea, Largest_rectangle(heights));
        }
        
        return maxarea;
    }
    
    public static int Largest_rectangle(int[] arr){
        Stack<Integer> s=new Stack<>();
        int max=0;
        for(int i =0;i<=arr.length;i++){
            int curr=i==arr.length?0:arr[i];
            while(!s.empty()&&curr<arr[s.peek()]){
                int h=arr[s.pop()];
                int w=s.empty()?i:i-s.peek()-1;
                max=Math.max(max, h*w);
            }
            s.push(i);
        }
        return max;
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '1', '1', '1'}
        };

        int result = calculate_rect(matrix);
        System.out.println(result);
    }
}
