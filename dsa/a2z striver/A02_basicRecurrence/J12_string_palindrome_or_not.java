import java.util.Scanner;
public class J12_string_palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder reverseString = new StringBuilder(str);

        int left = 0;
        int right = reverseString.length()-1;

        while(left<right){
            char temp = reverseString.charAt(left);
            reverseString.replace(left, left+1, String.valueOf(reverseString.charAt(right)));
            reverseString.replace(right, right+1, String.valueOf(temp));

            left++;
            right--;
        }

        System.out.println("Reverse String: "+reverseString);

        if (reverseString.toString().equals(str)) {
            System.out.println("Given String is palindrome.");
        }else{
            System.out.println("Given String is not palindrome.");
        }

        sc.close();
    }
}
