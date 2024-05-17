package Ex_Ra;

import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String password;
        System.out.println("Nhập email: ");
        email = scanner.nextLine();
        System.out.println("Nhập password: ");
        password = scanner.nextLine();
        while (!email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+$") || password.contains(" ") || password.length() < 6) {
            System.out.println("Email hoặc password không đúng định dạng, mời nhập lại");
            System.out.println("Nhập email: ");
            email = scanner.nextLine();
            System.out.println("Nhập password: ");
            password = scanner.nextLine();
        }
        System.out.println("Email và password hợp lệ");
    }
}