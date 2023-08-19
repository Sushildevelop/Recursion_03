package Practice.Recursion_3;

public class MAX_In_array {
    static int maxInarray(int arr[],int idx){
         // Base case
        if (idx==arr.length-1){
            return arr[idx];
        }
        // small problems
        int smallAns=maxInarray(arr,idx+1);

        // self work and final ans
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        System.out.println(maxInarray(arr,0));
    }
}
