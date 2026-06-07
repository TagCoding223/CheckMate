public class P10 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 0; i < (2*n)-1; i++) {

            int k = 0;
            if(i<=((2*n)-1)/2){
                k = i+1;
            }else{
                k = n - (i-(n-1)) ;
            }

            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // second solution
        for (int i = 1; i <= 2*n-1; i++) {
            int star = i;

            if(i>n){
                star = (2*n)-i;
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
