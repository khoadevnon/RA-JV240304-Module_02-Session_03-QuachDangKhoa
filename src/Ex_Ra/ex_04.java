package Ex_Ra;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận: ");
        int row = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        int col = scanner.nextInt();
        double[][] arr = new double[row][col];
        System.out.println("Nhập vào các phần tử của ma trận: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Ma trận vừa nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        double max = arr[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận là: " + max + " tại vị trí arr[" + x + "][" + y + "]");
    }
}
