package Practice.Recursion_3;

public class sum_of_array {
    static int sum(int arr[],int indx){
        // base case
        if (indx==arr.length-1){
            return arr[indx];
        }
        // recursive
        int sums=sum(arr,indx+1);
        // selfwork
        return arr[indx]+sums;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,20,1};
        System.out.println(sum(arr,0));
    }
}
