package com.hdh.array;

public class 区间和 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i -1] + arr[i];
        }
        int sum = new 区间和().calculateRangeSum(arr, 1, 3);
        System.out.println(sum);
    }

    /**
     * 给定一个整数数组 Array，请计算该数组在每个指定区间内元素的总和。
     * 输入描述
     * 第一行输入为整数数组 Array 的长度 n，接下来 n 行，每行一个整数，表示数组的元素。随后的输入为需要计算总和的区间，直至文件结束。
     * 输出描述
     * 输出每个指定区间内元素的总和。
     * @param num
     * @param start
     * @param end
     * @return
     */
    public int calculateRangeSum(int num[] ,int start ,int end){
        if (start == 0) {
            return num[end];
        }else {
            return num[end] - num[start -1];
        }
    }
}
