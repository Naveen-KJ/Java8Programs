package Programs.strings;


public class PrintVowels {
    public static void main(String[] args) {
        String input = "String without vowels";
        printVowels(input);
    }

    public static void printVowels(String str) {
        str.chars()
           .filter(c -> Character.toString((char) c).matches("[aeiouAEIOU]"))
           .mapToObj(c -> String.valueOf((char) c))
           .forEach(System.out::print);
    }
}
