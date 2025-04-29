package com.hdh.array;

public class 二分查找 {
    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     * 示例 1:
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     * 示例 2:
     * 输入: nums = [-1,0,3,5,9,12], target = 2
     * 输出: -1
     * 解释: 2 不存在 nums 中因此返回 -1
     * 提示：
     * 你可以假设 nums 中的所有元素是不重复的。
     * n 将在 [1, 10000]之间。
     * nums 的每个元素都将在 [-9999, 9999]之间。
     */
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        //[left,right]
        while (startIndex <= endIndex){
            int midIndex = (startIndex + endIndex) / 2;
            if (target > nums[midIndex]) {
                //目标值在右边
                startIndex = midIndex - 1;
            }else if (target < nums[midIndex]){
                //目标值在左边
                endIndex = midIndex + 1;
            }else {
                return midIndex;
            }
        }
        return -1;
    }

    public int search1(int[] nums, int target){
        int left = 0;
        int right = nums.length;
        //[left,right)
        while (left < right) {
            int middle = left + ((right - left) >> 1);
            if (target < nums[middle]) {
                right = middle;
            }else if (target > nums[middle]) {
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {-1,0,3,5,9,12};
        //int[] arr = {5};x
        int target = 9 ;
        二分查找 二分查找 = new 二分查找();
        int searchIndex = 二分查找.search1(arr, target);
        System.out.println(searchIndex);
    }
}
