import java.util.*;
public class stackArray{
    static final int max = 10;
    static int stack[] = new int[max];
    static int top = -1;

    public static void push(int element){
        if(top == max - 1){
            System.out.println("Overflow!!");
            return;
        }
        top++;
        stack[top] = element;
    }
    public static void pop(){
        if(top == -1){
            System.out.println("Underflow");
            return;
        }
        top--;
    }
     public static boolean isEmpty(){
        return top == -1;
    }
    public static int size(){
        return top+1;
    }
    public static void display(){
        if(top == -1){
            System.out.println("Stack underflow cannot print");
        }
        for(int i=top; i>=0; i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice, element;

        while(true){
             System.out.println("Enter choice:\n1.Push\n2.Pop\n3.Display\n4.Size\n5.isEmpty\n6.Exit");
             choice = s.nextInt();
           switch(choice){
                case 1:
                System.out.println("Enter elements (-1 to stop):");
                while(true){
                    element = s.nextInt();
                    if(element == -1) break;
                    push(element);
                }
                break;

                case 2:
                pop();
                System.out.println("Element poped successfully");
                break;

                case 3:
                System.out.println("Stack elements are: ");
                display();
                break;

                case 4:
                System.out.println("Size of the stack is "+ size());
                break;

                case 5:
                System.out.println("IsEmpty result is: "+ isEmpty());
                break;

                case 6:
                System.out.println("Closing stack operations!!");
                s.close();
                return;

                default:
                System.out.println("Invalid choise type number btw 1-6 only!!");
           }
        }
    }
}