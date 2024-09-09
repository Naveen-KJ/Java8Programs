package Programs.strings;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringPreservingSpaces {

	public static void main(String[] args) {
		String input="I Am Not a String";
		String result=reverseStringPreservingSpaces(input);
		System.out.println(result); // Output: "g ni rtS a toNmAI"

	}

	private static String reverseStringPreservingSpaces(String str) {

		// Extract non-space characters and reverse them
		List<Character> chars=str.chars()
		.filter(c-> c!=' ') // Filter out spaces
		.mapToObj(c->(char) c) // Convert int to Character
		.collect(Collectors.toList());
		
		Collections.reverse(chars); // Reverse the list of characters
		
		// Create a StringBuilder to build the result
		StringBuilder result=new StringBuilder();
		int charIndex=0; // Index for the reversed characters
		
		// Iterate through the original string
		for(char c:str.toCharArray()) {
			if(c==' ') {
				result.append(' '); // Keep spaces in their original position
			}else {
				result.append(chars.get(charIndex++));
			}
		}
		
		return result.toString();
	}

}
