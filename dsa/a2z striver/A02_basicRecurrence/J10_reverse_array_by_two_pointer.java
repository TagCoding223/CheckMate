import java.util.Scanner;

public class J10_reverse_array_by_two_pointer {
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

        System.out.println("Current array: ");
        printArr(arr);

        int left = 0;
        int right = size - 1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed array: ");
        printArr(arr);

        sc.close();
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
