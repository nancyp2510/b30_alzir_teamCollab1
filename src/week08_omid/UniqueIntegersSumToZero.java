package week08_omid;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueIntegersSumToZero {

    public static int[] generateArrayWithZeroSum(int N) {
        if (N < 2 || N >= 100) {
            return null;
        }

        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            int randomNumber = getRandomNumber(-100, 100);
            result[i] = randomNumber;
            sum += randomNumber;
        }

        result[N - 1] = -sum;

        return result;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }


    public static void main(String[] args) {
        int N = 4;
        int[] result = generateArrayWithZeroSum(N);
        if (result != null) {
            for (int num : result) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Invalid input for N.");
        }
    }
}
