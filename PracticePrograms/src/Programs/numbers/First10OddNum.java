package Programs.numbers;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class First10OddNum {

	public static void main(String[] args) {
		Stream.iterate(new int[] {1,3}, f->new int[] {f[1],f[1]+2})
		.limit(10)
		.map(f->f[0])
		.forEach(i -> System.out.print(i+" "));
		
		//first 10 even numbers
		
		IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
		
	
		IntStream.rangeClosed(1, 10)
				.forEach(number -> {
	                if (number % 2 == 0) {
	                    System.out.println(number);
	                }
				});
		
		IntStream.rangeClosed(1, 10)
		.forEach(number -> {
            if (number % 2 != 0) {
                System.out.println(number);
            }
		});
		}
		
}
