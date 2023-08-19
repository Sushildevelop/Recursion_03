package Practice.Recursion_3;

public class Print_array_values {
    static void printArray(int[]arr,int idx){
        // Base case
        int n= arr.length;
        if (idx==n){
            return;
        }
        // self work
        System.out.print(arr[idx]+" ");
        // recursive work
        printArray(arr,idx+1);
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
         printArray(arr,0);
    }
}
