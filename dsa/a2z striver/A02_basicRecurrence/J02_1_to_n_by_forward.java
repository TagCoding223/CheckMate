import java.util.Scanner;

public class J02_1_to_n_by_forward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printUpToNum(1,num);

        sc.close();
    }    

    public static void printUpToNum(int count, int num){
        if (count>num) return;

        System.out.print(count+" ");
        printUpToNum(++count, num);
    }
}

/*
The work is done before the recursive call.
Call stack for n = 3:

print(3)
  print(2)
    print(1)
      return

Output:

3 2 1

This is forward recursion because processing occurs during the descent phase.
*/