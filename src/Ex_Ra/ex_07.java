package Ex_Ra;

import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        if (str1.contains(str2)) {
            System.out.println("The first string contains the second string");
        } else {
            System.out.println("The first string does not contain the second string");
        }

    }
}
