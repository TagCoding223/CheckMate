import java.util.Scanner;

public class J07_prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number is not prime.");
        }

        // second approach
        // {
        //     int cnt = 0;  // Initialize a counter variable to count the number of factors

        //     for (int i = 1; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             cnt++; // If n is divisible by i, increment the counter

        //             // If n is not a perfect square, count its reciprocal factor
        //             if (n / i != i) {
        //                 cnt++;
        //             }
        //         }
        //     }

        //     // If the number of factors is exactly 2 (1 and the number itself), it's prime
        //     return cnt == 2;
        // }

        sc.close();
    }
}
