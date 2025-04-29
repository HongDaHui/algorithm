package com.hdh.array;

import com.hdh.Main;

public class 有序数组的平方 {
    /**
     * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
     *示例 1：
     * 输入：nums = [-4,-1,0,3,10]
     * 输出：[0,1,9,16,100]
     * 解释：平方后，数组变为 [16,1,0,9,100]
     * 排序后，数组变为 [0,1,9,16,100]
     * 示例 2：
     * 输入：nums = [-7,-3,2,3,11]
     * 输出：[4,9,9,49,121]
     *
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length -1;
        int[] newArr = new int[nums.length];
        int newRightIndex = nums.length-1;
        while (leftIndex <= rightIndex){
            int leftTemp = nums[leftIndex];
            int rightTemp = nums[rightIndex];

            if (Math.abs(leftTemp) > Math.abs(rightTemp)){
                newArr[newRightIndex] = leftTemp * leftTemp;
                leftIndex ++;
            }else {
                newArr[newRightIndex] = rightTemp * rightTemp;
                rightIndex--;
            }
            newRightIndex --;
        }
        return newArr;
    }

    public static void main(String[] args) {
        //int[]  arr = {-4,-1,0,3,10};
        int[]  arr = {-5,-3,-2,-1};
        int[] ints = new 有序数组的平方().sortedSquares(arr);
        System.out.println();
    }
}
