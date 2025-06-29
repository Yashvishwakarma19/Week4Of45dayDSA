public class nextGreaterEleBrute{
    public static int[] nextGreater(int[] arr){
         int n = arr.length;
        int nge[] = new int[n];

        for(int i=0;i<n;i++){
            int next = -1;
            for(int j=i+1;j<n;j++){
                if(arr[j]> arr[i]){
                    next = arr[j];
                    break;
                }
            }
            nge[i] = next;
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