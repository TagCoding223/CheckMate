import java.util.HashMap;
import java.util.Scanner;

public class J08_hash_with_map_for_longInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        System.out.print("How many integer you have: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        builtHash(hashMap, arr);

        System.out.print("Find occurrence of: ");
        int find = sc.nextInt();

        if (hashMap.containsKey(find)) { // avoiding printing null instead of 0.
            System.out.println(find+" occurs "+hashMap.get(find)+" times.");
        }else{
            System.out.println(find+" occurs "+0+" times.");
        }


        sc.close();
    }

    public static void builtHash(HashMap<Integer,Integer> hashMap, int []arr){
        for(int i : arr){
            hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
        }
    }
}
