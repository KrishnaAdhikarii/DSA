class Node1{
    int data;
    Node1 next;
     Node1(int x){
         data=x;
        next=null;
    }
}



class LinkedList{
    Node1 head;

    private  void insertLast( int data) {
        Node1 newnode=new Node1(data);
        if(head==null){
            head=newnode;
            return ;
        }
        Node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;      

    }

    private  void insertPosition(int pos, int data) {
        if (pos<1) {
            System.out.println("Invalid Position:");
            return;
        }
        Node1 newnode=new Node1(pos);
        Node1 temp=head;
        while(--pos>0){
            temp=temp.next;  
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public Node1 insertStart(int i) {
        Node1 newnode=new Node1(i);
        newnode.next=head;
        head=newnode;
        return head;
    }
    public  void display() {
        Node1 node=head;
        while(node!=null){
         System.out.print(node.data+" ");
         node=node.next;
        }
        System.out.println();
     }
     private  void delete(int val){
       Node1 temp=head; 
       Node1 previous=null;
        while(temp.data!=val){
            previous=temp;
            temp=temp.next;
        }
        previous.next=temp.next;
     }
     private  void deletePosition(int pos){
       Node1 temp=head;
       Node1 previous=null;       
        if(pos<1){
            System.out.println("Invalid Position");
            return;
        }
        else{
            if(pos==1){
                head=temp.next;
            }
            else{
                while(--pos>0){
                    previous=temp;
                    temp=temp.next;
                }
                previous.next=temp.next;
            }       

        }
    }

    

public static void main (String args[]) 
    {
    
        LinkedList ll=new LinkedList();
        // LinkedList ll2=new LinkedList();
        ll.insertStart ( 12);
        ll.insertStart ( 16);
        ll.insertStart (20);
     
        ll.insertLast (10);
        ll.insertLast ( 14);
        ll.insertLast ( 18);
        ll.insertLast ( 11);
 
        //Inserts after 3rd position
        ll.insertPosition ( 3, 23);
        ll.delete(10);
        ll.deletePosition(2);

        ll.display();
 
    }
    public Node1 midnode(){
        Node1 first=head;
        Node1 second=head;
        while (second.next!=null) {
            first=first.next;
            second=second.next.next;        
        }
        return first;
    }
    
    public void reverse_list() {
        Node1 next = null;
        Node1 prev = null;
        Node1 curr = head;
    
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
    }

    public void deletenode() {
        


        throw new UnsupportedOperationException("Unimplemented method 'deletenode'");
    }
    

 
}
