package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận: ");
        int rowNo = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận: ");
        int colNo = scanner.nextInt();
        int[][] matrix = new int[rowNo][colNo];


        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("Nhập phần tử ở hàng %d, cột %d: ", row, column);
                matrix[row][column] = scanner.nextInt();
            }
        }
        System.out.println("In ma trận ra màn hình: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println("");
        }

        double min = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (min > matrix[row][column]) {
                    min = matrix[row][column];
                }
            }
        }
        System.out.println("Min là: " + min);
    }
}
