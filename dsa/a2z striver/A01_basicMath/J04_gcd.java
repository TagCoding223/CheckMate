import java.util.Scanner;

public class J04_gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);

        while(min>0){
            if (num1%min==0 && num2%min==0){
                break;
            }
            min--;
        }

        System.out.println("Maximum greatest common divisor: "+min);

        sc.close();
    }
}
