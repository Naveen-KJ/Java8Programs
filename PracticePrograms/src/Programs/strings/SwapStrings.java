package Programs.strings;

public class SwapStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swapping without using a third variable
        str1 = str1 + str2; // Concatenate strings
        str2 = str1.substring(0, str1.length() - str2.length()); // Extract original str1
        str1 = str1.substring(str2.length()); // Extract original str2

        System.out.println("After swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}