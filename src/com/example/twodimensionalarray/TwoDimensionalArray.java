package com.example.twodimensionalarray;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        System.out.println("This program creates two-dimensional array 10x10 and calculate the sum of the elements on the diagonal.");
        int[][] nums = new int[10][10];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j == i) {
                    nums[i][j] = i;
                }
                else {
                    nums[i][j] = 0;
                }
            }
        }
        for (int[] row : nums) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
