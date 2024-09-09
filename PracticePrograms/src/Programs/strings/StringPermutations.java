package Programs.strings;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringPermutations {
    public static void main(String[] args) {
        String input = "ABC";
        Stream<String> permutations = findPermutations(input);
        permutations.forEach(System.out::println);
    }

    public static Stream<String> findPermutations(String str) {
        if (str.isEmpty()) {
            return Stream.of("");
        }

        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(i))
                .flatMap(c -> findPermutations(str.substring(0, i) + str.substring(i + 1))
                        .map(p -> c + p));
    }
}