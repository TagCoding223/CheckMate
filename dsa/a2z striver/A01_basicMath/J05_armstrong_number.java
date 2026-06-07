import java.util.Scanner;
public class J05_armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digitCount = (int)Math.log10(num)+1;

        int tempNum = num;
        int armNum = 0;

        while(tempNum>0){
            int remainder = tempNum%10;
            armNum = armNum + (int)Math.pow(remainder, digitCount);
            tempNum = tempNum/10;
        }

        if(num==armNum){
            System.out.println("This is an armstrong number.");
        }else{
            System.out.println("This is not an armstrong number.");
        }

        sc.close();
    }
}
