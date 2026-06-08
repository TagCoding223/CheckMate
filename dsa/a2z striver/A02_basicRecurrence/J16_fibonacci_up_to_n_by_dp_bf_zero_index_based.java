import java.util.Scanner;

public class J16_fibonacci_up_to_n_by_dp_bf_zero_index_based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if(n==0){
            System.out.println("0");
        }else if(n==1){
            System.out.println("1");
        }else{
            int fib[] = new int[n+1];
            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i < n+1; i++) {
                fib[i] = fib[i-1]+fib[i-2];
            }
            
            for (int i = 0; i < fib.length; i++) {
                System.out.print(fib[i]+" ");
            }
        }


        sc.close();
    }
}
