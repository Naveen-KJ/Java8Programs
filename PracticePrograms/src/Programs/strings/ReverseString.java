package Programs.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="I Am Not a String";
		
		String reversed=IntStream.range(0, str.length())
				.map(i-> str.charAt(str.length()-1-i))
				.mapToObj(c->String.valueOf((char) c))
				.collect(Collectors.joining());
		System.out.println(reversed);
		
	    String reverse=str.chars() // Convert to IntStream
	                .mapToObj(c -> (char) c) // Convert int to Character
	                .sorted((a, b) -> -1) // Sort in reverse order
	                .map(String::valueOf) // Convert each character back to String
	                .collect(Collectors.joining()); // Join characters into a single string
	    System.out.println(reverse);	
	    
	    String rev = str.chars() // Create an IntStream of characters
	    	    .mapToObj(c -> (char)c) // Convert int to Character
	    	    .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1); // Reduce to reverse the order
	    System.out.println(rev);
	}

}
