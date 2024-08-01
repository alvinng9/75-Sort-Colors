package org.example;

public class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length && right >= i; i++) {
            if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
            } else if (nums[i] == 2) {
                swap(nums, i, right);
                right--;
                i--;
            }
        }
    }

    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
