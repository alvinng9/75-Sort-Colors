package org.example;

public class Solution {
    public void sortColors(int[] nums) {
        //create 2 pointers at the front and the back of the given array
        int left = 0;
        int right = nums.length - 1;
        //iterate through the given array up until when i is less than
        //or equal to the right pointer
        for (int i = 0; i < nums.length && i <= right; i++) {
            //if nums[i] equals to 0, swap with the left pointer
            if (nums[i] == 0) {
                swap(nums, left, i);
                left++;
                //if nums[i] equals to 2, swap with the right pointer
            } else if (nums[i] == 2) {
                swap(nums, right, i);
                right--;
                i--;
            }
        }
    }

    // function to swap indexes' values in an array
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
