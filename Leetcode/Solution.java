package Leetcode;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int sum = nums[i] + nums[j];
                if (sum == target) {
                    System.out.println("["+i+ "," + j+"]");
                }

            }
        }
    }
}
