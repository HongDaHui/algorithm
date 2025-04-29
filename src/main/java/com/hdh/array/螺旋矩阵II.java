package com.hdh.array;

public class 螺旋矩阵II {
    /**
     * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
     * 输入：n = 3
     * 输出：[[1,2,3],[8,9,4],[7,6,5]]
     * 示例 2：
     *
     * 输入：n = 1
     * 输出：[[1]]
     */
    public int[][] generateMatrix(int n) {
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int count = 1;
        int loop = 1;
        int i,j;
        int[][] arr =new int[n][n];
        while (loop <= n / 2) {
            //顶部
            for (j = startY; j < n - offset ; j++) {
                arr[startX][j] = count++;
            }
            //右列
            for (i = startX; i < n -offset; i++){
                arr[i][j] = count++;
            }
            //底部
            for (;j > startY ;j --){
                arr[i][j] = count++;
            }
            //左列
            for (; i > startX; i--){
                arr[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;
        }
        if (n % 2 ==1){
            arr[startX][startY] = count;
        }
        return arr;
    }

    public void displayArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        螺旋矩阵II luoXuan = new 螺旋矩阵II();
        int[][] arr = luoXuan.generateMatrix(3);
        luoXuan.displayArr(arr);

    }
}
