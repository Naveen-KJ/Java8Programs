package Programs.strings;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharFinder {

	public static void main(String[] args) {
		String input = "Better Butter";
		
		String duplicates=input.chars() // Create an IntStream of characters
				.mapToObj(c->(char) c) // Convert int to Character
				.collect(Collectors.groupingBy(c->c,Collectors.counting())) // Group by char and count
				.entrySet().stream() // Convert to Stream<Map.Entry<Character, Long>>
				.filter(e->e.getValue()>1) // Filter duplicates
				.map(e->String.valueOf(e.getKey())) // Convert to String
				.collect(Collectors.joining());
		
		System.out.println(duplicates);
		
		
		Map<Character, Long> duplicateswithCount = input.chars() // Create an IntStream of characters
				.mapToObj(c->(char) c) // Convert int to Character
				.collect(Collectors.groupingBy(c->c,Collectors.counting())) // Group by char and count
				.entrySet().stream() // Convert to Stream<Map.Entry<Character, Long>>
				.filter(e->e.getValue()>1) // Filter duplicates
				.collect(Collectors.toMap(
	                Map.Entry::getKey, // Key is character
	                Map.Entry::getValue // Value is count
	            ));
		
		System.out.println(duplicateswithCount);
	}

}
