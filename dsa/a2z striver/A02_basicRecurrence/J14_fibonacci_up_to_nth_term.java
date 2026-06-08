import java.util.Scanner;

public class J14_fibonacci_up_to_nth_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 0;
        int j = 1;
        int k = 1;

        System.out.print("Fibonacci series up to "+n+"th term: ");
        while(k<=n/2){
            System.out.print(i+" "+j+" ");

            i = i+j;
            j = i+j;

            if(n%2!=0 && k>=n/2){
                System.out.print(i);
            }

            k++;
        }

        sc.close();
    }
}
