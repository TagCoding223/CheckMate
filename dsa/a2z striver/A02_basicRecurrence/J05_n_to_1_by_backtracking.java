import java.util.Scanner;

public class J05_n_to_1_by_backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printNumTo1(1,num);

        sc.close();
    }

    public static void printNumTo1(int count,int num){
        if (count>num) return;

        printNumTo1(count+1,num); 
        System.out.print(count+" ");
    }
}
