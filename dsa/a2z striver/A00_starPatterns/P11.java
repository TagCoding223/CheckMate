public class P11 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            StringBuilder symbol = new StringBuilder();
            if(i%2==0){
                symbol.append('0');
            }else{
                symbol.append('1');
            }
            for (int j = 1; j < i ; j++) {

                if(symbol.charAt(symbol.length()-1)=='0'){
                    symbol.append('1');
                }else{
                    symbol.append('0');
                }
            }
            System.out.println(symbol);
        }

        // second solution (Math is the key)
        for (int i = 0; i < n; i++) {
            int start = 0;
            if (i%2==0) {
                start = 1;
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
    }
}
