package ss1_oop_overview.Test;

import java.util.Scanner;

public class Student {

    String name;
    int age;
    String gender;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào giới tính: ");
        gender = scanner.next();
    }

    public void output() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
    }
}
