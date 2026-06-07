public class P14 {
    public static void main(String[] args) {
        int n = 5;
        char start = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)((int)start+j));
            }
            System.out.println();
        }

        System.out.println();
        // second solution

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A'+i ; ch++) { // behind the hde character comparison use ascii value
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
