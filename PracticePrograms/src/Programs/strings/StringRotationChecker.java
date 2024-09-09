package Programs.strings;

import java.util.stream.Collectors;

public class StringRotationChecker {

	public static void main(String[] args) {
		String str1 = "abcde";
        String str2 = "deabc";

        boolean isRotation = isStringRotation(str1, str2);
        System.out.println("Is \"" + str2 + "\" a rotation of \"" + str1 + "\"? " + isRotation);
		
		
	}
	
	public static boolean isStringRotation(String s1, String s2) {
	    // Check if lengths are equal
	    if (s1.length() != s2.length()) {
	        return false;
	    }
	    
	 // Concatenate s1 with itself
	    String concatenated = s1 + s1;

	    // Use streams to check if s2 is a substring of the concatenated string
	    return concatenated.codePoints()
	        .mapToObj(c -> String.valueOf((char) c))
	        .collect(Collectors.joining())
	        .contains(s2);
	}

}
