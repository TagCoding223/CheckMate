import java.util.Scanner;

public class J01_count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int n = num;

        while(n!=0){
            n = n / 10;
            count++;
        }

        
        System.out.println("The number "+num+" has "+count+" digits.");
        
        // second approach
        System.out.println("The number "+num+" has "+((int)(Math.log10(num))+1)+" digits.");
        sc.close();
    }
}
