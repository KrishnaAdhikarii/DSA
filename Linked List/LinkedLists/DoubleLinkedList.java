class Node{
    int data;
    Node previous;
    Node next;
    Node(int z){
        data=z;
        previous=null;
        next=null;
    }
}
public class DoubleLinkedList {
    Node head;
    void insertStart(int item){
        Node newnode=new Node(item);
        Node temp=head;
        if(temp==null){
            head=newnode;
        }
        else{
        newnode.next=temp;
        temp.previous=newnode;
        head=newnode;}
    }
    void insertLast(int item){
        Node newnode=new Node(item);
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.previous=temp;
    }
    void insertPosition(int pos,int data){
        Node newnode=new Node(data);
        Node temp=head;
        while(--pos!=0){
            temp=temp.next;
        }
        newnode.previous=temp;
        newnode.next=temp.next;
        temp.next=newnode;
    }
    void delete(int val){
        Node temp=head;
        Node Prev;
        while (temp.data!=val) {
           temp=temp.next; 
        }
        Prev=temp.previous;
        Prev.next=temp.next;
        temp=temp.next;
        temp.previous=Prev;

    }
    void deletePosition(int pos){
        Node temp=head;
        Node Prev;
        while(--pos>0){
            temp=temp.next;
        }
        Prev=temp.previous;
        Prev.next=temp.next;
        temp=temp.next;
        temp.previous=temp.next;

    }
    void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    




    public static void main(String[] args) {
        DoubleLinkedList L1= new DoubleLinkedList();
        L1.insertStart( 12);
        L1.insertStart( 16);
        L1.insertStart (20);
     
        L1.insertLast (10);
        L1.insertLast ( 14);
        L1.insertLast ( 18);
        L1.insertLast ( 11);
    
        //Inserts after 3rd position
        L1.insertPosition ( 3, 23);
        L1.delete(10);
        L1.deletePosition(2);
    
        L1.display();
    }
    
}