public class P07 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            int j = 1;

            while(j<=n-i){
                System.out.print(" ");
                j++;
            }

            
            while(j < n + i){
                System.out.print("*");
                j++;
            }
            
            System.out.println();
        }
    }
}
