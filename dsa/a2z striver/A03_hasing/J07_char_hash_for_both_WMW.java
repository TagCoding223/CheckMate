import java.util.Scanner;

public class J07_char_hash_for_both_WMW { // WMW: with my way
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hashArr[] = new int[52];

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character do you want to find: ");
        char ch = sc.next().charAt(0);

        builtCharHash(hashArr, str);

        int occursOfCh;
        if(Character.isLowerCase(ch)){
            occursOfCh = hashArr[ch-'a'];
        }else{
            occursOfCh = hashArr[ch-'A'+26];
        }

        System.out.println(ch+" occurs "+occursOfCh+" times.");


        sc.close();
    }

    public static void builtCharHash(int []hashArr, String str){
        for (char ch : str.toCharArray()) {
            if(Character.isLowerCase(ch)){
                hashArr[ch-'a']++;
            }else{
                hashArr[ch-'A'+26]++;
            }
        }
    }
}
