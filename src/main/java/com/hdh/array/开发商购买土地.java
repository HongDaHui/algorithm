package com.hdh.array;

public class 开发商购买土地 {

    public static void main(String[] args) {
        int[][] arr={
                {1 ,2 ,3},
                {2 ,1 ,3},
                {1, 2, 3},
                {1, 2, 111  }
        };
        int solution = new 开发商购买土地().solution(arr);
        System.out.println(solution);
    }

    public int solution(int[][] arr){
        int x = arr.length;
        int y = arr[0].length;

        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum += arr[i][j];
            }
        }
        int[] xArr = new int[x];
        int[] yArr = new int[y];

        //横轴 xArr
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                xArr[i] += arr[i][j];
            }
        }

        //纵轴 yArr
        for (int j = 0; j < y; j++) {
            for (int[] ints : arr) {
                yArr[j] += ints[j];
            }
        }

        int result = Integer.MAX_VALUE;
        int horizontalCut = 0;
        for (int i = 0; i < xArr.length; i++) {
            horizontalCut += xArr[i];
            result = Math.min(result, Math.abs((sum - horizontalCut) -horizontalCut));
        }

        int verticalCut = 0;
        for (int j = 0; j < yArr.length; j++) {
            verticalCut += yArr[j];
            result  = Math.min(result, Math.abs((sum - verticalCut) - verticalCut));
        }

        return result;
    }
}
