public class TwoSum {

    public static void main(String[] args){
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        // 
        for(int i=0;i<2;i++){
            System.out.println(result[i]);
        }
    }

    static int[] twoSum(int[] arr, int target) {
        int []arr2=new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    arr2[0]=i;
                    arr2[1]=j;
                    return arr2;
                }
            }
        }
        return arr2; // Return an empty array if no solution is found
    }
}
