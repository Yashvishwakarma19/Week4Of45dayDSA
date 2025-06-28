public class stackLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        Node top;
        int size;
        stackLL(){
            top = null;
            size = 0;
        }

        public void push(int x){
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            size++;
        }
        public void pop(){
            if(top == null){
                System.out.println("Underflow");
                return;
            }
            Node temp = top;
            top = top.next;
            temp = null;
            size--;
        }
        public int peek(){
            if(top == null){
                System.out.println("Underflow");
                return -1;
            }
            return top.data;
        }
        public boolean isEmpty(){
            return top == null;
        }
        public int size(){
            return size;
        }
        public void display(){
            if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements are: ");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        }
    public static void main(String[] args) {
         stackLL s = new stackLL();
         s.push(9);
         s.push(7);
         s.push(2);
         s.display();

         System.out.println("Top element is: " + s.peek()); 

        s.pop();
        s.display(); 

        System.out.println("Size of stack: " + s.size()); 
        System.out.println("Is stack empty? " + s.isEmpty());

         s.pop();
        s.pop();
        s.pop(); 

        System.out.println("Is stack empty? " + s.isEmpty());
    }
}