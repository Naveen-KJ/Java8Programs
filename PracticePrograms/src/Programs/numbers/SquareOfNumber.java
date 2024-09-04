package Programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SquareOfNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		Set<Integer> uniqueSquares = numbers.stream()
		    .map(n -> n * n)
		    .collect(Collectors.toSet());

		System.out.println(uniqueSquares);
	}
}
