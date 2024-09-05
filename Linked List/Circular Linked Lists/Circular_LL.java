/**
 * Circular_LL
 */

 /**
  * Node
  */
 class Node {
    int data;
    Node next;
    Node(int c){
        data=c;
        next=null;
    }    
 }

public class Circular_LL {
    Node head;






    






    private void display() {
        if(head==null){
            System.out.println("Empty List");
        }
        Node curr=head;
        while(curr.next!=head){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }



    }






    private void deleteLast() {
        if(head==null){
            System.out.println("cant Delete");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next.next!=head){
            curr=curr.next;
        }
        curr.next=head;


    }






    private void deleteFirst() {


        if(head==null){
            System.out.println("cant Delete");
            return;
        }
        if(head.next==head){
            head=null;
        }
        Node temp=head.next;
        
        head.data=temp.data;
        head.next=temp.next;



    }






    private void insertPos(int data, int pos) {
       Node newnode=new Node(data);
       int size=checksize(pos);
       
       if(pos==1){
            insertFirst(data);
            return;
        }
        if(pos<0||pos>size){
            System.out.println("Invalid Position");
            return;
        }
        if(pos==size){
            insertLast(data);
        }
        Node curr=head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
        }
        newnode.next=curr.next;
        curr.next=newnode;





    }






    private int checksize(int pos) {
         Node temp=head;
         int size=0;
         while(temp.next!=head){
            temp=temp.next;
            size++;
         }
         return size;

    }






    private void insertLast(int i) {
        Node newnode=new Node(i);
        if(head==null){
            newnode.next=newnode;
            head=newnode;
            return;
        }
        
        newnode.next=head.next;
        head.next=newnode;

        int tempdata=head.data;

        head.data=newnode.data;
        newnode.data=tempdata;
        head=newnode;

    }






    private void insertFirst(int i) {
        Node newnode=new Node(i);
        if(head==null){
            head=newnode;
            head.next=head;
            return;
        }
        if(head.next==head){
            newnode.next=head;
            head.next=newnode;
            head=newnode;
            return;
        }
        Node temp=head;
        newnode.next=temp.next;
        temp.next=newnode;

        int tempdata=temp.data;
        temp.data=newnode.data;
        newnode.data=tempdata;




        // TODO Auto-generated method stub
    }

    private void deletePos(int pos) {
        int size=checksize(pos);
        if(pos<0||pos>size){
            System.out.println("Invalid Postion");
            return;
        }
        if(pos==1){
            deleteFirst();
        }
        Node curr=head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        // TODO Auto-generated method stub
    }

    public static void main(String[] args) {
        Circular_LL L1= new Circular_LL();
        L1.insertFirst(5);
        L1.insertFirst(55);
        L1.insertFirst(5555);

        L1.insertLast(10);
        L1.insertPos(5,2);
        
        
        L1.deleteFirst();
        L1.deletePos(2);
        L1.deleteLast();
        L1.display();
    }






    

    
}