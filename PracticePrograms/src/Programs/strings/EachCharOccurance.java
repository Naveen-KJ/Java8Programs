package Programs.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharOccurance {

	public static void main(String[] args) {
		String inputString = "Java Concept Of The Day";
        
        Map<Character, Long> charCountMap = 
                    inputString.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);
        
        String word = "Java Concept Of The Day";
        Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
        
        Map<String, Long> charCot = Arrays.stream(inputString.split(""))
        		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(charCot);
	}

}
