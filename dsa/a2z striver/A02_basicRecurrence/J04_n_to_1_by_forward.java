import java.util.Scanner;

public class J04_n_to_1_by_forward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printNumTo1(num);

        sc.close();
    }

    public static void printNumTo1(int num){
        if (num==0) return;

        System.out.print(num+" ");
        printNumTo1(num-1); 
    }
}
