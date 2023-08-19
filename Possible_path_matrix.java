package Practice.Recursion_3.Assignment;

public class Possible_path_matrix {
    static int countPathsRecursive(int m,int n){
        // Base case
        if (m==1||n==1){
            return 1;
        }
        return countPathsRecursive(m-1,n)+countPathsRecursive(m,n-1);
    }
    public static void main(String[] args) {
        int m=2;
        int n=3;
        System.out.println(countPathsRecursive(m,n));
    }
}
