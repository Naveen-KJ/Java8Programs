package Programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
		recursiveFactorial(6);
		tradFactorial(7);
		
		List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5,6);
	    List<Long> longs = Arrays.asList(1L, 2L, 3L, 4L, 5L);
	    List<Double> doubles = Arrays.asList(1.2d, 2.3d, 3.0d, 4.0d, 5.0d);
	    List<Float> floats = Arrays.asList(1.3f, 2.2f, 3.0f, 4.0f, 5.0f);
	    
	    System.out.println(ints.stream().reduce(1, (a,b) -> a * b));

	    long intSum = ints.stream().mapToInt(Integer::intValue).sum();
	    long longSum = longs.stream().mapToLong(Long::longValue).sum();
	    double doublesSum = doubles.stream().mapToDouble(Double::doubleValue).sum();
	    double floatsSum = floats.stream().mapToDouble(Float::doubleValue).sum();

	    System.out.println(String.format(
	            "Integers: %s, Longs: %s, Doubles: %s, Floats: %s",
	            intSum, longSum, doublesSum, floatsSum));
	
		
	}
	
	public static long factorial(int n) {
	    return LongStream.rangeClosed(1, n)
	                      .reduce(1, (a, b) -> a * b);
	}
	
	public static long tradFactorial(int n) {
	    long result = 1;
	    for (int i = 1; i <= n; i++) {
	        result *= i;
	    }
	    return result;
	}
	
	public static long recursiveFactorial(int n) {
	    if (n == 0 || n == 1) {
	        return 1;
	    } else {
	        return n * factorial(n - 1);
	    }
	}
	
	
}
