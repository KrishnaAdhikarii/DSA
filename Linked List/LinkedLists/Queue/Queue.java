class Queue{
 
    int capacity;
    int rear;
    int curr;
    int front;
    int[] arr;
    
     Queue(int cap){
       capacity =cap;
        front = curr =0;
        rear=capacity-1;
        arr=new int[capacity];
    }

     void enqueue(int m){
        if(isfull()){
            System.out.println("Queue is Full");
            return;
        }
        else{
        rear=(rear+1)%capacity;
        curr++;
        arr[rear]=m;
        System.out.println(m + " Enqueued");
        }
    }
     boolean isfull() {
       return(curr==capacity);
    }

     int dequeue(){
        if(isempty()){
            System.out.println(" Queue is Empty");
            return -1;
        }
        else{
        int item =arr[front];
        front=(front+1)%capacity;
        curr--;
        // System.out.println(item+" Dequeued");
        return item;
        }
    }


    boolean isempty() {
        return(curr==0);
    }


    public int peek() {
        if (isempty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Assuming -1 represents an invalid value for this example
        } else {
            return arr[front];
        }
    }
    public int size() {
       return curr;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.dequeue();
        queue.dequeue();
        
    
        System.out.println("Queue size: " + queue.size()); // Output: 3
        System.out.println("Front of the queue: " + queue.peek()); // Output: 1
    
        System.out.println("dequeue: " + queue.dequeue()); // Output: 1
        System.out.println("Queue size after dequeue: " + queue.size()); // Output: 2
    }
    
}