package Ex_Ra;
import java.util.Scanner;
public class ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng đã nhập: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nPhần tử nhỏ nhất trong mảng là: " + min);
    }
}

