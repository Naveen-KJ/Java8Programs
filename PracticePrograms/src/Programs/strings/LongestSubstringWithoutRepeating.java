package Programs.strings;

import java.util.LinkedHashMap;

/*public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String input = "javaconceptoftheday";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }

    public static String findLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0; // Left pointer for the sliding window
        int maxLength = 0; // Length of the longest substring
        String longestSubstring = ""; // To store the longest substring

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, move the left pointer
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            charSet.add(currentChar);

            // Update the maximum length and the longest substring if needed
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                longestSubstring = s.substring(left, right + 1);
            }
        }

        return longestSubstring;
    }
}*/

public class LongestSubstringWithoutRepeating {
	
	public static void main(String[] args) {
		longestSubString("javaconceptoftheday");
		System.out.println("============================");
		longestSubString("thelongestsubstring");
	}

	private static void longestSubString(String str) {
		String longetSubString=null;
		int longetSubStringLength=0;
		
		//LinkedHashMap<Character,Integer> charPosMap=new LinkedHashMap<Character, Integer>();
		
		/*for(int i=0;i<str.length();i++){
			if(!charPosMap.containsKey(str.charAt(i))) {
				charPosMap.put(str.charAt(i), i);
			}else {
				i=charPosMap.get(str.charAt(i));
				charPosMap.clear();
			}
			
			if(charPosMap.size() > longetSubStringLength) {
				longetSubStringLength=charPosMap.size();
				longetSubString=charPosMap.keySet().toString();
			}
		}
		*/
		System.out.println("Input String : "+str);
		System.out.println("The Longest substring : "+longetSubString);
		System.out.println("The Longest substring Length: "+longetSubStringLength);
		
	}
}

