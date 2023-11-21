package week08_omid;

public class MoveZerosToEnd {

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroCount = 0;

        // Counts the number of non-zero elements and move them to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroCount] = arr[i];
                nonZeroCount++;
            }
        }

        // Fills the remaining elements with zeros
        for (int i = nonZeroCount; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(input);

        // printing the modified array
        for (int num : input) {
            System.out.print(num + " ");
        }
    }
}
