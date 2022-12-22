/*
75. Sort Colors:

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2] */

class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid = 0;
        int high =nums.length-1;
        int temp=0;

        while(mid<=high){
            switch(nums[mid]){
                case 0 :
                    temp= nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
            }
        }
    }
}
