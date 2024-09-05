import java.util.LinkedList;
import java.util.Queue;

class LeftNodeOnly {
    void LeftNodeOnly1(Node curr){
        Queue <Node> Q=new LinkedList<>();
        if(curr==null){
            return ;
        }
        Q.add(curr);
        while( Q.isEmpty()){
            
            for(int i=0;i<Q.size();i++){
                Node temp=Q.poll();
                if(i==0){
                    System.out.println(temp.data);
                    if(temp.left!=null){
                        Q.add(temp.left);

                    }
                    if(temp.right!=null){
                        Q.add(temp.right);

                    }
                }
            }
        }
    }
}
