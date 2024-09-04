package Programs.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumofNaturalNumbers {

	public static void main(String[] args) {

		int sum = IntStream.range(1, 11).sum();

		System.out.println(sum);

		// SUM, Average of Array
		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };

		int sumofArr = Arrays.stream(a).sum();
		System.out.println("Sum = " + sumofArr);

		double average = Arrays.stream(a).average().getAsDouble();
		System.out.println("Average = " + average);

		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("Maximum = " + max);

		int min = Arrays.stream(a).max().getAsInt();
		System.out.println("Minimum = " + min);
		
		long count = Arrays.stream(a).count();
		System.out.println("Total Number of elements = " + count);
		
		List<Integer> sortedArr= Arrays.stream(a).boxed().sorted().collect(Collectors.toList());
		System.out.println("Sorted Array elements = " + sortedArr);
		
		/*List<Integer> desArr= Arrays.stream(a).boxed()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());*/
		
		List<Integer> desArr= Arrays.stream(a).boxed()
				.sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
		System.out.println("Sorted elements Descending= " + desArr);
		
		/*List<Integer> ascArr= Arrays.stream(a).boxed()
				.sorted(Comparator.naturalOrder()).collect(Collectors.toList());*/
		
		List<Integer> ascArr= Arrays.stream(a).boxed()
				.sorted((i,j)->i.compareTo(j)).collect(Collectors.toList());
		System.out.println("Sorted elements Ascending= " + ascArr);
		
		List<Integer> max3Num=Arrays.stream(a).boxed()
				.sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println("Maximum 3 Numbers: "+max3Num);
		
		
	}

}
