package Ex_Ra;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int array[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhập số cần chèn: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();

        if (index <= 1 || index >= n) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            int temp1 = array[index];
            array[index] = x;
            for (int i = index + 1; i < n; i++) {
                int temp2 = array[i];
                array[i] = temp1;
                temp1 = temp2;
            }
        }

        System.out.println("Mảng sau khi chèn " + x + " vào vị trí " + index + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}