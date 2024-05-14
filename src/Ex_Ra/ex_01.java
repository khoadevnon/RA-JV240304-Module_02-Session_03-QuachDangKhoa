package Ex_Ra;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xóa: ");
        int x = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tìm thấy " + x + " trong mảng");
        } else {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("Mảng sau khi xóa " + x + " là: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
