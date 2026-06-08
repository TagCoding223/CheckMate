import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J11_reverse_array_by_built_in_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array: ");
        int size = sc.nextInt();

        List <Integer> arrList = new ArrayList<>();

        System.out.println("Enter array elements;");
        for (int i = 0; i < size; i++) {
            System.out.print("Element "+(i+1)+": ");
            int temp = sc.nextInt();
            arrList.add(temp);
        }

        System.out.print("Current array: ");
        System.out.println(arrList);

        Collections.reverse(arrList);

        System.out.print("Reversed array: ");
        System.out.println(arrList);        
        
        sc.close();
    }
}
