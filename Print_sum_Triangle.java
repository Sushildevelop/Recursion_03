package Practice.Recursion_3.Assignment;

public class Print_sum_Triangle {
    public static void printTriangle(int[] arr, int level, int currentIndex) {
        if (level == 0) {
            System.out.println(arr[currentIndex]);
            return;
        }

        int newLevelSize = arr.length - level + 1;
        int[] newLevelArr = new int[newLevelSize];

        for (int i = 0; i < newLevelSize - 1; i++) {
            newLevelArr[i] = arr[currentIndex + i] + arr[currentIndex + i + 1];
        }

        printTriangle(newLevelArr, level - 1, currentIndex);

        // Print the current level elements
        for (int i = 0; i < newLevelSize; i++) {
            System.out.print(newLevelArr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        printTriangle(arr, arr.length, 0);

    }
}
