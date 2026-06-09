import java.util.Scanner;

public class J06_char_hash_for_both { // all ascii characters 256
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hashArr[] = new int[256];

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character do you want to find: ");
        char ch = sc.next().charAt(0);

        builtCharHash(hashArr, str);

        System.out.println(ch+" occurs "+hashArr[ch]+" times.");


        sc.close();
    }

    public static void builtCharHash(int []hashArr, String str){
        for (char ch : str.toCharArray()) {
            hashArr[ch]++;
        }
    }
}
