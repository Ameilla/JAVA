package DailyCoding.LeetCode;

public class _198_House_Robber {
    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }
    static public int rob(int[] nums) {
        if(nums.length<2)
            return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
