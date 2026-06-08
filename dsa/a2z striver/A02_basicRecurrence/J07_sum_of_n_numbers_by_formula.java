import java.util.Scanner;

public class J07_sum_of_n_numbers_by_formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sumOfN = (num*(num+1))/2;

        System.out.println("Sum is: "+sumOfN);

        sc.close();
    }
}
