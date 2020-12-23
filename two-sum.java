/*
https://leetcode.com/problems/two-sum/
23/12/20
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = {-1,-1};
        for(int i=0; i<nums.length; i++){
            int value = target - nums[i];
            for (int j=i+1; j<nums.length; j++)
            {
                if (value == nums[j]){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
                    
            }
            
        }
    return arr;
    }
}
