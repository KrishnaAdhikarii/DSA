import java.util.Arrays;
import java.util.LinkedList;

public class prblm2 {
    public static int[] deck(int[] deck){
        LinkedList<Integer> Q=new LinkedList<>();
        int[] ans=new int[deck.length];
        Arrays.sort(deck);
        
        for(int i=0;i<deck.length;i++){
            Q.offer(i);
        }
            for(int e:deck){
                ans[Q.poll()]=e;
                if(!Q.isEmpty()){
                    Q.offer(Q.poll());
                }

            }
        
    return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,54,558,1,4,57,78};
        int[] ans=deck(arr);
        for (int e:ans) {
            System.out.print(e+" ");
        }
    }
}
