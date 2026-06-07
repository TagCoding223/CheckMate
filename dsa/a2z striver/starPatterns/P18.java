public class P18 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            ch = (char)(ch + n - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
