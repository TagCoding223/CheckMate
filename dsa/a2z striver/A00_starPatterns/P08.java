public class P08 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i > 0; i--) {
            int j = n;

            while(j>i){
                System.out.print(" ");
                j--;
            }

            j = j + i - 1;
            while(j>0){
                System.out.print("*");
                j--;
            }

            System.out.println();
        }
    }
}
