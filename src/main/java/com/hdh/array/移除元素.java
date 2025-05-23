package com.hdh.array;

public class 移除元素 {
    /**
     *给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
     * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
     * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
     * 返回 k。
     */
    public int removeElement(int[] nums, int val) {
        int firstIndex = 0;
        int secondIndex = 0;
        while (secondIndex < nums.length) {
            if (nums[secondIndex] != val) {
                nums[firstIndex] = nums[secondIndex];
                firstIndex ++;
            }
            secondIndex ++;
        }
        return firstIndex;
    }

    public static void main(String[] args) {
        //int[] arr = {-1,0,3,5,9,12};
        int[] arr = {3,2,2,3};
        //int[] arr = {5};x
        int target = 3 ;
        int i = new 移除元素().removeElement(arr, target);
        System.out.println(i);
    }
}
