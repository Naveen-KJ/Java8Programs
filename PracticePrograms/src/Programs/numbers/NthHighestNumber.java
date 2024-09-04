package Programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NthHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
        int n = 3; // Change n to find the nth highest number

        Optional<Integer> nthHighest = findNthHighest(numbers, n);
        
        nthHighest.ifPresentOrElse(
            value -> System.out.println("The " + n + "th highest number is: " + value),
            () -> System.out.println("No such element found.")
        );
    }

    public static Optional<Integer> findNthHighest(List<Integer> numbers, int n) {
        if (n <= 0 || n > numbers.size()) {
            throw new IllegalArgumentException("Invalid value of n");
        }

        return numbers.stream()
            .distinct() // Remove duplicates
            .filter(num -> numbers.stream().filter(x -> x > num).count() < n) // Filter numbers that have n greater numbers
            .findFirst(); // Get the first element that matches the condition
    }
}
