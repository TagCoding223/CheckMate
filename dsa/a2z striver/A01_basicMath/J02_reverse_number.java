import java.util.Scanner;
public class J02_reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverseNum = 0;

        while(num>0){
            int remainder = num%10;
            reverseNum = reverseNum*10 + remainder;
            num = num / 10;
        }

        System.out.println("Reverse number: "+reverseNum);

        sc.close();
    }
}
