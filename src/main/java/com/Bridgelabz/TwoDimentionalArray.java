package com.Bridgelabz;

/**
 * Create a Two Dimentional Array
 */

import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        // Take Row & Col input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Array of size = " + row + "*" + col + " ");

        int array[][] = create2DArray(sc, row, col);
        print2DArray(array, row, col);
    }
    // create array method
    private static int[][] create2DArray(Scanner sc, int row, int column) {
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }

        }
        return array;
    }
    // print method
    private static void print2DArray(int[][] array, int row, int column) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
