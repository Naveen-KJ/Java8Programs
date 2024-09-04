package Programs.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;

public class MaxNumberUsingStream {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};

        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Largest number using max() is: " + max);
        
        int max2 = Arrays.stream(numbers).reduce(Integer::max).getAsInt();
        System.out.println("Largest number using reduce() is: " + max2);
        
        int maxc = Collections.max(Arrays.asList(new Integer[]{5, 9, 11, 2, 8, 21, 1}));
        System.out.println("Largest number using Collections.max() is: " + maxc);
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		OptionalInt maxo = list.stream().mapToInt(Integer::intValue).max();
		System.out.println("Second maximum number: " + maxo);
    }
}

