package Programs.numbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        List<Integer> primes = findPrimes(1000);
        System.out.println(primes);
    }

    public static List<Integer> findPrimes(int limit) {
        return IntStream.rangeClosed(2, limit)
                .filter(PrimeNumberFinder::isPrime)
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(divisor -> number % divisor == 0);
    }

    /*public static boolean isPrimeFunctional(int number) {
        return number > 1 && !IntStream.range(2, number)
                .anyMatch(divisor -> number % divisor == 0);
    }

    public static boolean isPrimeRecursive(int number) {
        return isPrimeRecursive(number, 2);
    }

    private static boolean isPrimeRecursive(int number, int divisor) {
        if (number <= 2) {
            return number == 2;
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrimeRecursive(number, divisor + 1);
    }*/
}
