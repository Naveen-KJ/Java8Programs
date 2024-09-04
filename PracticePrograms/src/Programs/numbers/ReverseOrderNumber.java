package Programs.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderNumber {

	 public static void main(String[] args) 
	    {
	        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
	         
	        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	        System.out.println("====================================");
	        decimalList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
	        
	        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	         
	        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
	        System.out.println("Maximum Element : "+max);
	         
	        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
	        System.out.println("Minimum Element : "+min);
	    }
}
