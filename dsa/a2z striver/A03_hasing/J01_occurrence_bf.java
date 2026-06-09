public class J01_occurrence_bf {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,3,2,1,4,5};
        
        int appearanceOf1 = appearanceCount(arr,1);
        System.out.println("1 occur "+appearanceOf1+" time.");
        
        int appearanceOf2 = appearanceCount(arr,2);
        System.out.println("2 occur "+appearanceOf2+" time.");
        
        int appearanceOf3 = appearanceCount(arr,3);
        System.out.println("3 occur "+appearanceOf3+" time.");
        
        int appearanceOf4 = appearanceCount(arr,4);
        System.out.println("4 occur "+appearanceOf4+" time.");

        // if we need for n numbers occurs then for loop run n times for n numbers, so time complexity will be O(n*n). or O(Q*n) where Q is query of occurrence and n for loop
    }

    public static int appearanceCount(int []arr, int find){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==find){
                count++;
            }
        }
        return count;
    }
}
