package Practice.Recursion_3.Assignment;

public class Combinations {
    static void generateCombinations(int []arr ,int n ,int r,int index, int[]data,int i){
        if (index==r){
            for (int j=0;j<r;j++){
                System.out.print(data[j]+" ");
            }
            System.out.println();
            return;
        }
        // Fill the remaining slots of the combinations using elements from array
        if (i>=n){
            return;
        }
        data[index]=arr[i];
        generateCombinations(arr,n,r,index+1,data,i+1);
        generateCombinations(arr,n,r,index,data,i+1);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int r=2;
        int n=arr.length;

        int[]data=new int[r];
        generateCombinations(arr,n,r,0,data,0);
    }
}
