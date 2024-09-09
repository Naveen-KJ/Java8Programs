package Programs.strings;

import java.util.*;
import java.util.stream.Collectors;

public class MostRepetitiveCharacter {
    public static void main(String[] args) {
        String input = "Java Concept Of The Day";
        char mostRepetitiveChar = findMostRepetitiveCharacter(input);
        System.out.println("Most repetitive character: " + mostRepetitiveChar);
    }

    public static char findMostRepetitiveCharacter(String str) {
        // Use a LinkedHashMap to maintain the order of characters
        Map<Character, Long> charCountMap = str.chars()
            .filter(c -> !Character.isWhitespace(c)) // Filter out whitespace
            .mapToObj(c -> (char) c) // Convert int to Character
            .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Count occurrences

        System.out.println("charCountMap" + charCountMap);
        
        // Find the character with the maximum count
        return charCountMap.entrySet().stream()
            .max(Map.Entry.comparingByValue()) // Get the entry with the max count
            .map(Map.Entry::getKey) // Get the character
            .orElseThrow(() -> new RuntimeException("No characters found")); // Handle empty case
    }
}
