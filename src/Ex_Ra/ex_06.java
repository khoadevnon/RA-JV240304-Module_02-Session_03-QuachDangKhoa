package Ex_Ra;
import java.util.Scanner;
public class ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi 1: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập chuỗi 2: ");
        String str2 = sc.nextLine();
        System.out.println("Chuỗi sau khi nối: " + str1.concat(str2));

    }
}
