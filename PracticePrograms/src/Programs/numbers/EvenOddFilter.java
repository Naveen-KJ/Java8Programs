package Programs.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOddFilter {
    public static void main(String[] args) {
    	
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		IntStream stm = Arrays.stream(arr);
		stm.filter(n->n%2==0).forEach(System.out::print);
		
		IntStream li=Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9,10});
    	li.filter(n->n%2==0).forEach(System.out::print);
		 
    	List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    	List result=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
    	System.out.println("Even numbers: " + result);
    	
    	List<Integer> numb = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    	
        Map<Boolean, List<Integer>> partitioned = numb.stream()
             .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));
    }
}