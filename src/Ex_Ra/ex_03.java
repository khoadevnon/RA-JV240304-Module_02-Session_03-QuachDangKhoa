package Ex_Ra;


import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử của mảng 1: ");
        n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập số phần tử của mảng 2: ");
        n = scanner.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Mảng sau khi gộp: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
