package Programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SecondMaxUsingSorted {
	public static void main(String[] args) {
		int[] numbers = { 5, 9, 11, 2, 8, 21, 1 };

		// Method 1: Using Stream.sorted()

		int secondMax = Arrays.stream(numbers).distinct() // To handle duplicates
				.sorted().toArray()[numbers.length - 2]; // Get the second last element

		System.out.println("Second maximum number using sorted() is: " + secondMax);

		// Method 2: Using Stream.limit()

		int secondMaxL = Arrays.stream(numbers).distinct() // To handle duplicates
				.boxed() // Convert to Integer for sorting
				.sorted((a, b) -> b - a) // Sort in descending order
				.limit(2) // Limit to the top 2 numbers
				.skip(1) // Skip the first (max) number
				.findFirst() // Get the second max
				.orElseThrow(() -> new IllegalArgumentException("Array must contain at least two distinct elements"));

		System.out.println("Second maximum number using limit() is: " + secondMaxL);

		// Method 3: Using reduce()
		
		/*int[] maxes = Arrays.stream(numbers)
				.distinct() // To handle duplicates
				.reduce(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE}, (acc, n) -> {
                    if (n > acc[0]) {
                        acc[1] = acc[0]; // Update second max
                        acc[0] = n; // Update max
                    } else if (n > acc[1] && n != acc[0]) {
                        acc[1] = n; // Update second max
                    }
                    return acc;
                });

		if (maxes[1] == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Array must contain at least two distinct elements");
		}

		System.out.println("Second maximum number using reduce() is: " + maxes[1]);*/

		// Method 4: Using a Custom Comparator with Stream

		int secondMaxC = Arrays.stream(numbers).distinct() // To handle duplicates
				.boxed() // Convert to Integer for sorting
				.sorted((a, b) -> b.compareTo(a)) // Sort in descending order
				.skip(1) // Skip the first (max) number
				.findFirst() // Get the second max
				.orElseThrow(() -> new IllegalArgumentException("Array must contain at least two distinct elements"));

		System.out.println("Second maximum number using comparator is: " + secondMax);
		
		// Find the maximum number
        OptionalInt max = Arrays.stream(numbers).max();

        // Find the second highest number
        OptionalInt secondHighest = Arrays.stream(numbers)
            .filter(num -> max.isPresent() && num < max.getAsInt()) // Filter out the maximum number
            .distinct() // Remove duplicates
            .max(); // Find the maximum of the remaining numbers

        System.out.println("Second highest number: " + secondHighest.orElse(-1));
		
		/*OptionalInt secondHighest = Arrays.stream(numbers)
	            .distinct() // Remove duplicates
	            .reduce((first, second) -> {
	                if (first > second) {
	                    return second; // Return the smaller of the two
	                }
	                return first;
	            })
	            .flatMap(first -> 
	                Arrays.stream(numbers)
	                    .filter(num -> num > first) // Filter numbers greater than the first
	                    .findFirst() // Find the first number greater than the first
	            );

	        System.out.println("Second highest number: " + secondHighest.orElse(-1)); // -1 if not found */
		
		
		
	}
}