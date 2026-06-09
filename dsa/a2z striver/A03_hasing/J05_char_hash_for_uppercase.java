import java.util.Scanner;

public class J05_char_hash_for_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hashArr[] = new int[26];

        System.out.print("Enter a uppercase string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character do you want to find: ");
        char ch = sc.next().charAt(0);

        builtCharHash(hashArr, str);

        System.out.println(ch+" occurs "+hashArr[ch-'A']+" times.");


        sc.close();
    }

    public static void builtCharHash(int []hashArr, String str){
        for (char ch : str.toCharArray()) {
            hashArr[ch-'A']++;
        }
    }
}
