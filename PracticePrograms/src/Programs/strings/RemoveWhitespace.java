package Programs.strings;

import java.util.stream.Collectors;

public class RemoveWhitespace {

	public static void main(String[] args) {
		String input="Hello World";
		String noWhiteSpace=input.chars() // Create an IntStream of characters
				.filter(c->!Character.isWhitespace(c))  // Filter out whitespace characters
				.mapToObj(c->String.valueOf((char) c)) // Convert int to Character
				.collect(Collectors.joining());
		 System.out.println(noWhiteSpace);
	}

}
