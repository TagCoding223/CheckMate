public class P21 {
    public static void main(String[] args) {
        int n = 6;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            for (int j = 2; j < n; j++) {
                if (i==1 || i==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("*");
            System.out.println();
        }
    
    }
}
