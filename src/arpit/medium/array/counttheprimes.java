package src.arpit.medium.array;

public class counttheprimes {

    public static void main(String[] args) {

        int n = 100;
        int count = 0;

        for (int num = 2; num < n; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("Total primes = " + count);
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
