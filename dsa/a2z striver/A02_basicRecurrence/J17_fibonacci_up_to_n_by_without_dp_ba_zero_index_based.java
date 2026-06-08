import java.util.Scanner;

public class J17_fibonacci_up_to_n_by_without_dp_ba_zero_index_based {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n==0) {
            System.out.println("0");
        }else{
            int secondLast = 0;
            int last = 1;

            System.out.print(secondLast+" "+last);

            for (int i = 2; i < n+1; i++) {
                int curr = secondLast + last;

                System.out.print(" "+curr);

                secondLast = last;
                last = curr;
            }
        }

        sc.close();
    }
}
