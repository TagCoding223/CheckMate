import java.util.Scanner;

public class J18_fib_val_at_nth_place_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci value at "+n+"th place (0-based index): "+fib(n));

        sc.close();
    }

    public static int fib(int n){
        if(n<=1){
            return n;
        }

        int secondLast = fib(n-2);
        int last = fib(n-1);

        return secondLast+last;
    }
}
