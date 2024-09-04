package Programs.numbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 6, 3, 7, 8}; // Example array
        int N = numbers.length+1; // The maximum number in the range [1, N]

        // Calculate the expected sum of the first N natural numbers
        //int expectedSum = (N * (N + 1)) / 2;
        //int expectedSum = IntStream.rangeClosed(1, N).sum();

        // Calculate the actual sum of the numbers in the array using streams
        //int actualSum = Arrays.stream(numbers).sum();

        // The missing number is the difference between the expected and actual sums
        //int missingNumber = expectedSum - actualSum;

        int missingNumber=IntStream.rangeClosed(1, N).sum()-Arrays.stream(numbers).sum();
        System.out.println("The missing number is: " + missingNumber);
    }
}