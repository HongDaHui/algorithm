package com.hdh.array;

public class 长度最小的子数组 {

    /**
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其总和大于等于 target 的长度最小的 子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
     * 示例 1：
     * 输入：target = 7, nums = [2,3,1,2,4,3]
     * 输出：2
     * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
     * 示例 2：
     * 输入：target = 4, nums = [1,4,4]
     * 输出：1
     * 示例 3：
     * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
     * 输出：0
     */
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int leftIndex = 0;
        int rightIndex = 0;
        int sum = nums[leftIndex];
        while (rightIndex < nums.length) {
            if (sum >= target && rightIndex >= leftIndex){
                min = Math.min(min, rightIndex - leftIndex);
                //如果大于等于target，尝试缩减左边指针
                while (sum - nums[leftIndex] >= target && rightIndex >= leftIndex){
                    sum -= nums[leftIndex];
                    leftIndex ++;
                    min = Math.min(min, rightIndex - leftIndex);
                }
                if (sum - nums[leftIndex] < target ){
                    //右指针往右边移动
                    rightIndex ++;
                    if (rightIndex  < nums.length) {
                        sum += nums[rightIndex];
                    }
                }
            }else {
                //右指针往右边移动
                rightIndex ++;
                if (rightIndex  < nums.length) {
                    sum += nums[rightIndex];
                }
            }
        }
        //判断是否有这样的子区间
        return sum >= target ? min + 1 : 0;
    }

    public int minSubArrayLen1(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int i = new 长度最小的子数组().minSubArrayLen1(7, arr);
        System.out.println(i);
    }
}
