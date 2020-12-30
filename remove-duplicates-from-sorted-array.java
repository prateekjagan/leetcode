/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
30/12/20
*/


class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1, temp = 0;
        for (int j=0; j<nums.length - 1; j++)
        {
            if (nums[j+1]>nums[j]){
                nums[i] = nums[j+1];  
                i++;
                
            }
        }
     
    return i;
    }
}
