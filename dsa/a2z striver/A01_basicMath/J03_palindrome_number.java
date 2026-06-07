import java.util.Scanner;
public class J03_palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverseNum = 0;
        int tempNum = num;

        while(tempNum>0){
            int remainder = tempNum%10;
            reverseNum = reverseNum*10 + remainder;
            tempNum = tempNum/10;
        }

        if (reverseNum==num) {
            System.out.println("Number is a palindrome.");
        }else{
            System.out.println("Number is not a palindrome.");
        }


        sc.close();
    }
}
