import java.util.ArrayList;
import java.util.Scanner;

public class J06_all_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ArrayList<Integer> allDivisors = new ArrayList<>();

        int count = 1;
        while(count<=num){
            if(num%count==0){
                allDivisors.add(count);
            }
            count++;
        }

        System.out.print("All Possible Divisors of "+num+" is: "+allDivisors);

        System.out.println();
        // second approach
        // https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number optimal approach
        ArrayList<Integer> allDivisors1 = new ArrayList<>();

        int count1 = 1;
        while(count1*count1<=num){
            if(num%count1==0){
                allDivisors1.add(count1);

                if(count1 != num/count1){
                    allDivisors1.add(num/count1);
                }
            }
            count1++;
        }

        System.out.print("All Possible Divisors of "+num+" is: "+allDivisors1);


        sc.close();
    }
}
