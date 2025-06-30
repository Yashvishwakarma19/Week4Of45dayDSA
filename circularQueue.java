public class circularQueue{
    
    int[] queue;
    int front;
    int rear;
    int size;
    int capacity;
    public circularQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }

    public void push(int element){
        if(size == capacity){
            System.out.println("Overflow");
            return;
        }else{
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            size++;
        }
    }

    public void pop(){
        if(size == 0){
            System.out.println("Underflow");
            return;
        }else{
            front = (front + 1) % capacity;
            size--;
        }
    }

    public int getFront(){
        if(size == 0){
            System.out.println("CQ is empty");
            return -1;
        }else{
            return queue[front];
        }
    }
     public void display() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        circularQueue q = new circularQueue(5);

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        q.display(); // 10 20 30 40 50

        q.pop();
        q.pop();

        q.display(); // 30 40 50

        q.push(60);
        q.push(70);

        q.display(); // 30 40 50 60 70

        System.out.println("Front element: " + q.getFront());
    }
}