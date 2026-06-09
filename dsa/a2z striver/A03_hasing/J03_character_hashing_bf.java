
public class J03_character_hashing_bf {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string; ");
        String str = sc.nextLine();

        System.out.print("Enter a character they you want to find: ");
        char ch1 = sc.next().charAt(0);

        int occurrenceOfCh1 = findOccurrence(str, ch1);

        System.out.println(ch1+" occurs "+occurrenceOfCh1+" times.");

        sc.close();
    }

    public static int findOccurrence(String str, char ch){
        int count = 0;
        for(char c: str.toCharArray()){
            if(c==ch){
                count++;
            }
        }
        return count;
    }
}
