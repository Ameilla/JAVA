

//Maximum Consecutive Ones
//Problem statement
//Given a binary array 'ARR' of size 'N', your task is to find the longest sequence of continuous 1’s that can be formed by replacing at-most 'K' zeroes by ones. Return the length of this longest sequence of continuous 1’s.
//
//        Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//        1 <= T <= 10
//        1 <= N <= 5 * 10^4
//        0 <= Arr[i] <= 1
//        0 <= K <= N
//
//Time Limit: 1 sec
//Sample Input 1:
//        1
//        7
//        1 0 0 1 1 0 1
//        1
//Sample Output 1:
//        4
//Explanation of Sample Input 1:
//Here we can replace at-most one 0 by 1 ( since K = 1 ). So the longest consecutive subarray with all 1’s that we can get is by replacing the 0 present at index 5.
//
//So the updated array will be {1,0,0,1,1,1,1}.
//
//As we can see in the updated array the longest subarray with all 1’s is from index 3 of length 4.
//Sample Input 2:
//        2
//        10
//        1 0 0 1 0 1 0 1 0 1
//        2
//        5
//        1 1 0 1 1
//        2
//Sample Output 2:
//        5
//        5
//Explanation of Sample Input 2:
//Here, In the first test case we can replace at-most two 0’s by 1’s ( since 'K' = 2 ). So the longest consecutive subarray with all 1’s  we can get is by replacing the 0 present at index 4 and index 6 or index 6 and index 8 .
//So the updated array will be either {1,0,0,1,1,1,1,1,0,1} or {1,0,0,1,0,1,1,1,1,1}.
//
//In the second test case there is only one zero in the whole array and we are allowed to replace two 0’s by 1’s so the answer will be the size of the array, i.e. 5.


package DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;

public class Maximum_Consecutive_Ones {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 0, 1, 0, 1, 0, 1, 0, 1));
        int k = 2;
        System.out.print(longestSubSeg(arr, arr.size(), k));
    }

    public static int longestSubSeg(ArrayList<Integer> arr, int n, int k) {
        int left = 0, right =0, zero = 0, maxLength = 0;
        while(right < n){
            if(arr.get(right)==0){
                zero++;
            }
            while(zero > k){
                if(arr.get(left) == 0){
                    zero--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}
