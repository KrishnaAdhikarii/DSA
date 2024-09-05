import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    Node left;
    Node right;
    int data;
    Node(int c){
        data=c;
        left=right=null;
    }
}
public class Tree{
    Node Root=null;


    
    public static void main(String[] args) {
        Tree T1=new Tree();
       
        T1.Root=insert(1);
        T1.Root.left=insert(2);
        T1.Root.right=insert(3);
        T1.Root.left.left=insert(4);
        T1.Root.left.right=insert(5);

        
        System.out.println("Postorder");
        T1.postorder(T1.Root);
        System.out.println();
        System.out.println("PreOrder:");        
        preorder(T1.Root);
        System.out.println();
        System.out.println("Print By Level:");        
        printLevel(T1.Root);
        System.out.println();
        System.out.println("Number of Elements: "+ maxsize(T1.Root));  
        // System.out.println();
        System.out.println("Maximum Element: "+ maxElement(T1.Root));      
        // System.out.println();
        System.out.println("Left Elements: " ); 
        LeftNodeOnly(T1.Root); 
        System.out.println();
        System.out.println("Right Elements: " ); 
        RightNodeOnly(T1.Root);  
        System.out.println();
        System.out.println("Spiral Elements: " ); 
        PrintSpiral(T1.Root);  

        
    }



    private static int maxElement(Node curr) {
        if(curr==null){
            return -1;
        }
        return Math.max(curr.data, Math.max(maxElement(curr.left),maxElement(curr.right)));
        

    }



    private static int maxsize(Node Curr) {
       if(Curr==null){
        return 0;
       }
       return 1 + maxsize(Curr.left)+maxsize(Curr.right);
    }



    private static void printLevel(Node curr) {
        if(curr==null){
            return;
        }
        
        Queue <Node> Q = new LinkedList <> ();
        Q.add(curr);
        while (!Q.isEmpty()) {
            Node node = Q.poll();
            System.out.print(node.data+" ");
            if(node.left!=null){
                Q.add(node.left);
            }
            if(node.right!=null){
                Q.add(node.right);
            }
        }
    
    
    }



    static void preorder(Node curr) {
        if(curr!=null){
        System.out.print(curr.data +" ");
        preorder(curr.left);
        preorder(curr.right);
        }
    }



    private void postorder(Node curr) {
        if(curr==null){
            return;
        }
        postorder(curr.left);
        postorder(curr.right);
        System.out.print(curr.data +" ");
    }



    private static Node insert(int i) {
        return new Node(i);
    }



    static void LeftNodeOnly(Node curr){
        if(curr==null){
            return ;
        }
        Queue <Node> Q=new LinkedList<>();

        Q.add(curr);
        while( !Q.isEmpty()){
            int n=Q.size();
            for(int i=0;i<n;i++){

                Node temp=Q.poll();

                if(i==0){
                    System.out.print(temp.data+" ");
                }
                    if(temp.left!=null){
                        Q.add(temp.left);

                    }
                    if(temp.right!=null){
                        Q.add(temp.right);

                    }
                
            }
        }
    }


    static void RightNodeOnly(Node curr){
        if(curr==null){
            return ;
        }
        Queue <Node> Q=new LinkedList<>();

        Q.add(curr);
        while( !Q.isEmpty()){
            int n=Q.size();
            for(int i=0;i<n;i++){

                Node temp=Q.poll();

                if(i==0){
                    System.out.print(temp.data+" ");
                }
                    
                    if(temp.right!=null){
                        Q.add(temp.right);

                    }
                    if(temp.left!=null){
                        Q.add(temp.left);

                    }
                
            }
        }
    }


    static void PrintSpiral(Node curr){
        if(curr==null){
            return;
        }
        Stack<Node> S1=new Stack<>();
        Stack<Node> S2=new Stack<>();
        S1.add(curr);
        while(!S1.empty()&&!S1.empty()){
            while(!S1.empty()){
                Node temp=S1.pop();
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    S2.add(temp.left);
                }
                if(temp.right!=null){
                    S2.add(temp.right);
                }
            }
    
            while(!S2.empty()){
                Node temp=S2.pop();
                System.out.print(temp.data+" ");
                if(temp.right!=null){
                    S1.add(temp.right);
                }
                if(temp.right!=null){
                    S1.add(temp.left);
                }
            }

        }



    }


}