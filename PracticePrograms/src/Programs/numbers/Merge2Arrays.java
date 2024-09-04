package Programs.numbers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge2Arrays {

	public static void main(String[] args) {
		int a[]=new int[] {4,2,7,1,6};
		int b[]=new int[] {8,3,9,5,6};
		
		int c[]=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		
		//without duplicate
		//int c[]=IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		
		System.out.println(Arrays.toString(c));
	}
}
