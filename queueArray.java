import java.util.Scanner;

public class queueArray{
    static final int max = 5;
    static int[] queue = new int[max];
    static int front = -1;
    static int rear = -1;

    public static boolean isEmpty(){
        return front == -1 && rear == -1;
    }
    public static boolean isFull(){
        return rear == max-1;
    }
    public static int size(){
        if(isEmpty()) return 0;
        return rear - front +1;
    }
    public static void enqueue(int ele){
        if(rear == max-1){
            System.out.println("Overflow");
        }else if(front == -1 && rear == -1){
            front = rear = 0;
            queue[rear] = ele;
        }else{
            rear++;
            queue[rear] = ele;
        }
    }
    
    public static void dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Underflow");
        }else if(front == rear){
            front = rear = -1;
        }else{
            front++;
        }
    }
    public static void display(){
        if(front == -1 && rear == -1){
            System.out.print("Underflow");
        }else{
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int choice, element;

        while (true) {
            System.out.println("\nEnter the choice: ");
            System.out.println("1. Enqueue multiple elements (-1 to stop)");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Check if Empty");
            System.out.println("5. Check if Full");
            System.out.println("6. Size");
            System.out.println("7. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter elements (-1 to stop): ");
                    while (true) {
                        element = sc.nextInt();
                        if (element == -1) {
                            break;
                        }
                        enqueue(element);
                    }
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Is Empty: " + isEmpty());
                    break;

                case 5:
                    System.out.println("Is Full: " + isFull());
                    break;

                case 6:
                    System.out.println("Size: " + size());
                    break;

                case 7:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}