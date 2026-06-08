import java.util.Scanner;

public class J09_reverse_array_by_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements;");
        for (int i = 0; i < size; i++) {
            System.out.print("Element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        int reverseArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            reverseArr[i] = arr[size-i-1];
        }

        System.out.println("Reversed array;");
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i]+" ");
        }

        sc.close();
    }
}
