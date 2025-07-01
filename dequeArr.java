public class dequeArr{
    int n = 5;
    int front, rear;
    int deque[];

    public dequeArr(){
        deque = new int[n];
        front = -1;
        rear = -1;
    }
void enqueueFront(int element){
    if(front == 0 && rear == n-1 || front == rear+1){
        System.out.println("Overflow");
    }else if(front == -1 && rear == -1){
        front = rear = 0;
        deque[front] = element;
    }else if(front == 0){
        front = n-1;
        deque[front] = element;
    }else{
        front--;
        deque[front] = element;
    }
}
void enqueueRear(int element){
    if(front == 0 && rear == n-1 || front == rear+1){
        System.out.println("Overflow");
    }else if(front == -1 &&  rear == -1){
        front = rear = 0;
        deque[rear] = element;
    }else if(rear == n-1){
        rear = 0;
        deque[rear] = element;
    }else{
        rear++;
        deque[rear] = element;
    }
}
void dequeueFront(){
    if(front == -1 && rear == -1){
        System.out.println("Deque is Empty");
    }else if(front == rear){
        System.out.println("dequeued element:" +deque[front]);
        front = rear = -1;
    }else if(front == n-1){
        System.out.println("dequeued element:" +deque[front]);
        front = 0;
    }else{
        System.out.println("dequeued element:" +deque[front]);
        front++;
    }
}
void dequeueRear(){
    if(front == -1 && rear == -1){
        System.out.println("Deque is empty");
    }else if(front == rear){
        System.out.println("dequeued element:" +deque[rear]);
        front = rear = -1;
    }else if(rear == 0){
        System.out.println("dequeued element:" +deque[rear]);
        rear = n-1;
    }else{
         System.out.println("dequeued element:" +deque[rear]);
        rear--;
    }
}
void display(){
    if(front == -1 && rear == -1){
        System.out.println("Deque is empty");
        return;
    }
    int i= front;
    while(i != rear){
        System.out.print(deque[i]+" ");
        i = (i+1)%n;
    }
    System.out.println(deque[rear]);
}
void getFront() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(deque[front]);
        }
    }
 void getRear() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(deque[rear]);
        }
    }
public static void main(String[] args) {
     dequeArr dq = new dequeArr();
        dq.enqueueRear(10);
        dq.enqueueRear(20);
        dq.enqueueFront(5);
        dq.enqueueFront(3);
        dq.enqueueRear(25);

         System.out.println("\nDisplay after insertions:");
        dq.display();

        dq.dequeueFront();
        dq.dequeueRear();

         System.out.println("\nDisplay after deletions:");
        dq.display();

        System.out.print("\nGet Front: ");
    dq.getFront();

    System.out.print("Get Rear: ");
    dq.getRear();
}
}
