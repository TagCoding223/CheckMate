import java.util.Scanner;

public class J08_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fac = factorial(num);

        System.out.println("Factorial of "+num+" is: "+fac);

        sc.close();
    }

    public static long factorial(int num){
        if (num==1) return 1;
        return num * factorial(--num);
    }
}
