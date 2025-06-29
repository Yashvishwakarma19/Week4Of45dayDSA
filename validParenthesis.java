import java.util.Stack;

public class validParenthesis{
    public static boolean isValid(String inp){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<inp.length();i++){
            char ch = inp.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){            // opening brackets
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;

                if((st.peek() == '(' && ch == ')') ||
                    (st.peek() == '{' && ch == '}') ||
                    (st.peek() == '[' && ch == ']')){
                        st.pop();
                    }else{      // no match
                        return false;
                    }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({[]})";
        if(isValid(s)){
            System.out.println("Valid string");
        }else{
            System.out.println("Invalid string");
        }

        String t = "({[})";
        if(isValid(t)){
            System.out.println("Valid string");
        }else{
            System.out.println("Invalid string");
        }
        
    }
}