import java.util.Scanner;

public class Prblm1 {
    
    public static void main(String[] args) {
        LinkedList L1=new LinkedList();
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            L1.insertStart(data);
        }
        System.out.println("Linked List elements:");
        L1.display();

        L1.reverse_list();


        System.out.println("Reversed Linked List elements:");
        L1.display();
        Node1 temp=L1.midnode();
        System.out.println("Mid Element:"+temp.data );
        L1.deletenode();


        scanner.close();
    }
    
    
}
