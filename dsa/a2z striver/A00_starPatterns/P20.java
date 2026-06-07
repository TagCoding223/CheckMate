public class P20 {
    public static void main(String[] args) {
        int n = 5;

        int breakpoint = (2*n)/2;
        int star = 1;

        for (int i = 1; i < 2*n ; i++) {

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            for (int j = 2*star; j < 2*n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (breakpoint>i) {
                star++;
            }else if(breakpoint<i || breakpoint == i){
                star--;
            }
        }
    }
}
