package Programs.strings;

import java.util.stream.Collectors;

public class AnagramChecker {

	public static void main(String[] args) {
		String str1 = "Listen";
        String str2 = "Silent";

        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + isAnagram);

	}

	 public static boolean areAnagrams(String s1, String s2) {
	        // Check if lengths are equal
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Sort and compare the strings
	        String sortedS1 = s1.toLowerCase().chars()
	                .sorted()
	                .mapToObj(c -> String.valueOf((char) c))
	                .collect(Collectors.joining());

	        String sortedS2 = s2.toLowerCase().chars()
	                .sorted()
	                .mapToObj(c -> String.valueOf((char) c))
	                .collect(Collectors.joining());

	        return sortedS1.equals(sortedS2);
	     }
}
