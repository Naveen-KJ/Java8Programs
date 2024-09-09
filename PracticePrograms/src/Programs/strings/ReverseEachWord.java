package Programs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		String input = "Java Concept of The Day";
        String result = reverseEachWord(input);
        System.out.println(result); // Output: "avaJ tpecnoC fo ehT yaD"

	}

	private static String reverseEachWord(String str) {
		return Arrays.stream(str.split(" ")) // Split the string into words
		.map(word->new StringBuilder(word).reverse().toString()) // Reverse each word
		.collect(Collectors.joining(" ")); // Join the reversed words with spaces
		
		/*return Arrays.stream(str.split(" "))
				.map(word->word.chars().mapToObj(c->(char) c)
						.sorted((a,b)->-1)
						.map(String::valueOf)
						.collect(Collectors.joining("")))
				.collect(Collectors.joining(" "));*/
		
		
	}
	
	

}
