public class P17 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';

            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            ch--;
            for (int j = 0; j < i*2 - i; j++) {
                ch--;
                System.out.print(ch);
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
