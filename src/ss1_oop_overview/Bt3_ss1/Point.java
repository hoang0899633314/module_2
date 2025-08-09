package ss1_oop_overview.Bt3_ss1;

import java.util.Scanner;

public class Point {
    double x; //Toạ độ x của điểm
    double y; //Toạ độ y của điểm

    //Phương thức để nhập toạ độ điểm từ bàn phím
    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập toạ độ X: ");
        x = scanner.nextDouble();

        System.out.println("Nhập toạ độ y: ");
        y = scanner.nextDouble();
    }

    // phương thức để tính khoảng cách giữa điểm hện tại và một điểm khác
    double distanceTo(Point other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}
