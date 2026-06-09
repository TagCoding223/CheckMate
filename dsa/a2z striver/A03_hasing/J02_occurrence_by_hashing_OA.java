import java.util.Arrays;

public class J02_occurrence_by_hashing_OA { // OA: Optimal Approach
    public static void main(String[] args) {
        int arr[] = {1,4,2,4,2,4,5,3,1,6};

        int hashArr[] = new int[Arrays.stream(arr).max().getAsInt()+1];

        for (int i = 0; i < arr.length; i++) {
            hashArr[arr[i]]++;
        }

        System.out.println("1 occurs "+hashArr[1]+" time.");
        System.out.println("2 occurs "+hashArr[2]+" time.");
        System.out.println("3 occurs "+hashArr[3]+" time.");
        System.out.println("4 occurs "+hashArr[4]+" time.");
    }
}
