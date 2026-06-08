import java.util.Scanner;

public class J06_sum_of_n_numbers_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = sumOfN(num);

        System.out.println("Sum is: "+sum);

        sc.close();
    }

    public static int sumOfN(int num){
        if (num==1) return 1;
        return num+sumOfN(--num);
    }
}
