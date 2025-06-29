import java.util.Stack;

public class nextGreaterEleOtimised{
    public static int[] nextGreater(int[] arr){
         int n = arr.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            // Assign result
            if(st.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = st.peek();
            }

            // Push current element to stack
            st.push(arr[i]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int arr[] = {6,0,8,1,3};
        int result[] = nextGreater(arr);

        System.out.println("Next Greater Elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" --> "+result[i]);
        }
       
    }
}