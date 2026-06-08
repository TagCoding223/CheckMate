import java.util.Scanner;

public class J03_1_to_n_by_backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printUpToNum(num);

        sc.close();
    }
    
    public static void printUpToNum(int num){
        if (num==0) return;

        printUpToNum(num-1); // if i use --num here so for current function stack frame variable also update
        System.out.print(num+" ");
    }
}

/*
Quick Rule
Pattern	                        Work Done	                Terminology
Process → Recursive Call	    Before recursion	        Forward Recursion
Recursive Call → Process	    After recursion returns	    Backtracking Recursion
N → 1 printed before call	    Before recursion	        Forward Recursion
1 → N printed after return	    During unwinding	        Backtracking Recursion

Many DSA playlists incorrectly label "print N to 1" as backtracking just because the value decreases. The correct criterion is where the work is performed relative to the recursive call, not whether the number increases or decreases.
*/

/*
The work is done after the recursive call returns.

Call stack for n = 3:

printNumTo1(1,3)
 └─ printNumTo1(2,3)
     └─ printNumTo1(3,3)
         └─ printNumTo1(4,3)
             return
         print(3)
     print(2)
 print(1)

Output:

3 2 1

This is backtracking recursion because printing happens while the stack is unwinding.
*/