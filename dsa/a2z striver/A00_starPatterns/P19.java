public class P19 {
    public static void main(String[] args) {
        int n = 6;

        int star = n;
        int breakpoint = (2*n)/2;

        for (int i = 1; i <= n*2; i++) {
            
            for (int j = 1; j <= star; j++ ) {
                System.out.print("*");
            }

            for (int j = 2*star; j < 2*n ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= star; j++ ) {
                System.out.print("*");
            }
            System.out.println();

            if (breakpoint>i) {
                star--;
            } else if(breakpoint<i){
                star++;
            }
        }
    }
}
