package Programs.strings;

public class CharacterPercentageWithStreams {
	public static void main(String[] args) {
		String input = "Tiger Runs @ The Speed of 100 km/hour";
		calculateCharacterPercentage(input);
	}

	public static void calculateCharacterPercentage(String str) {
		int totalCharacters = str.length();
		if (totalCharacters == 0) {
			System.out.println("The string is empty.");
			return;
		}

		long upperCaseCount = str.chars().filter(Character::isUpperCase).count();

		long lowerCaseCount = str.chars().filter(Character::isLowerCase).count();

		long digitCount = str.chars().filter(Character::isDigit).count();

		long specialCharacterCount = str.chars()
				.filter(c -> !Character.isLetterOrDigit(c) && !Character.isWhitespace(c)).count();

		// Calculate percentages
		double upperCasePercentage = (upperCaseCount / (double) totalCharacters) * 100;
		double lowerCasePercentage = (lowerCaseCount / (double) totalCharacters) * 100;
		double digitPercentage = (digitCount / (double) totalCharacters) * 100;
		double specialCharacterPercentage = (specialCharacterCount / (double) totalCharacters) * 100;

		// Print results
		System.out.printf("Uppercase Letters: %.2f%%\n", upperCasePercentage);
		System.out.printf("Lowercase Letters: %.2f%%\n", lowerCasePercentage);
		System.out.printf("Digits: %.2f%%\n", digitPercentage);
		System.out.printf("Special Characters: %.2f%%\n", specialCharacterPercentage);
	}
}