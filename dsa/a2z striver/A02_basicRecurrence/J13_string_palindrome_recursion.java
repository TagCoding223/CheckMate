import java.util.Scanner;
public class J13_string_palindrome_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean isPalindrome = isStringPalindrome(0,str);

        if (isPalindrome) {
            System.out.println("Given string is palindrome.");
        }else{
            System.out.println("Given string is not palindrome.");
        }

        sc.close();
    }

    public static boolean isStringPalindrome(int i, String str){
        if (i>=str.length()/2) return true;

        if (str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }

        return isStringPalindrome(++i, str);
    }
}
