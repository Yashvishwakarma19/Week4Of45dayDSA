import java.util.Stack;

class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty()) {
            minSt.push(val);
        } else {
            minSt.push(Math.min(val, minSt.peek()));
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
            minSt.pop();
        }
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!minSt.isEmpty()) {
            return minSt.peek();
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        MinStack obj = new MinStack(); // Correct initialization
        obj.push(6);
        obj.push(3);
        obj.push(4);
        System.out.println("Current Min: " + obj.getMin()); // 3
        obj.pop();
        System.out.println("Top after pop: " + obj.top()); // 3
        System.out.println("Current Min: " + obj.getMin()); // 3
        obj.pop();
        System.out.println("Top after pop: " + obj.top()); // 6
        System.out.println("Current Min: " + obj.getMin()); // 6
    }
}
