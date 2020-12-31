/*
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
31/12/20
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;
        int i=0, j=size-1;
        while(numbers[i]+numbers[j]!=target){
            if(numbers[i]+numbers[j]>target)
                j--;
            else
                i++;
        }
        int[] result = {i+1,j+1}; 
        return result;
    }
}
