import java.util.Arrays;

public class PrimeGenerator {

    // Method to generate first n prime numbers
    public static int[] generatePrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int num = 2; // start from the first prime number

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        int n = 10; // Example: First 10 primes
        int[] primes = generatePrimes(n);
        System.out.println("First " + n + " primes: " + Arrays.toString(primes));
    }
}
