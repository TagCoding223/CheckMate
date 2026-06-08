import java.util.Scanner;
public class J15_fibonacci_up_to_n_by_dp_bf { // dp = dynamic programming, bf = brute force
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int fib[] = new int[n];

        int secondLast = 0;
        int last = 1;

        for (int j = 0; j < n; j++) {
            if(j == 0){
                fib[j] = secondLast;
            }else if(j==1){
                fib[j] = last;
            }else{
                int curr = secondLast + last;
                fib[j] = curr;

                secondLast = last;
                last = curr;
            }
        }

        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i]+" ");
        }



        sc.close();
    }

    
}
