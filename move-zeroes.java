/*
https://leetcode.com/problems/move-zeroes/
01/01/21
This is very bad at time complexity. (When you're in haste to find solution)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]==0){
                for(int j=i; j<nums.length - 1;j++){
                    temp = nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
               
        }
    }
