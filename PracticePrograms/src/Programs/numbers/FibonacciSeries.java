package Programs.numbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		int limit=150;
		Stream.iterate(new int[] {0,1}, f-> new int[] {f[1],f[0]+f[1]})
		.limit(25)
		.filter(f->f[0]<200)
		.map(f->f[0])
		.forEach(i->System.out.print(i+" "));
		
		List<Integer> lis=Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]})
		.takeWhile(f->f[0]<=limit)
		.map(f->f[0])
		.collect(Collectors.toList());
		
		System.out.println(lis);
		
		
	}
}
