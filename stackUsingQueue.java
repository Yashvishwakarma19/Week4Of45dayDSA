import java.util.Stack;

class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
               output.push(input.pop());
            }
        }
        return output.pop();
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        return (input.isEmpty() && output.isEmpty());
    }
}

public class stackUsingQueue {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();

       
        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Peek: " + obj.peek()); //  10
        System.out.println("Pop: " + obj.pop());   //  10
        System.out.println("Peek after pop: " + obj.peek()); // 20
        System.out.println("Is empty? " + obj.empty()); // false

        obj.pop(); // 20
        obj.pop(); // 30
        System.out.println("Is empty after removing all? " + obj.empty()); // true
    }
}
