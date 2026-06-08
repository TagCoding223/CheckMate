import java.util.Scanner;

public class J01_n_times_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("How many times: ");
        int n = sc.nextInt();

        printName(name,n);

        sc.close();
    }

    public static void printName(String name, int n){
        if (n==0) return;
        else {
            System.out.println(name);
            printName(name, --n);
        }
    }
}
