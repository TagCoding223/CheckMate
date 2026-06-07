public class P22 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < 2*n-1; i++) {
            
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = (2*n - 2)-i;
                int bottom = j;
                int right = (2*n - 2)-j;

                // if not understand recommend watch video with patience https://youtu.be/tNm_NNSB3_w?t=4546
                int minDist = Math.min(Math.min(top,bottom), Math.min(left, right));

                System.out.print((n-minDist)+" ");
            }
            System.out.println();
        }
    }
}
