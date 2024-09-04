package Programs.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		
		String st="Communication";
		
		String reversed=IntStream.range(0, st.length())
				.map(i-> st.charAt(st.length()-1-i))
				.mapToObj(c->String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(reversed);
		
	}

}
