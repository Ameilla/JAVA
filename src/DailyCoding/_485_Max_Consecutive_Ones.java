package DailyCoding;

public class _485_Max_Consecutive_Ones {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i : nums){
            if(i!=1){
                max = Math.max(max,count);
                count = 0;
            }
            else{
                count++;
            }
        }
        return max;
    }
}
