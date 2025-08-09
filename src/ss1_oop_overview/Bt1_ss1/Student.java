package ss1_oop_overview.Bt1_ss1;


import java.util.Scanner;

public class Student {
    String name;
    Double mathScore;
    Double lIteratureScore;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        name = scanner.nextLine();

        System.out.print("Nhập điểm toán: ");
        mathScore = scanner.nextDouble();

        System.out.print("Nhập điểm Văn: ");
        lIteratureScore = scanner.nextDouble();
    }

    double calculateAverageScore() {
        return (mathScore + lIteratureScore) / 2;
    }

    void output() {
        System.out.println("Thông tin học sinh:");
        System.out.println("Tên: " + name);
        System.out.println("Điểm toán: " + mathScore);
        System.out.println("Điẻm văn: " + lIteratureScore);
        System.out.println("Điểm trung bình: " + calculateAverageScore());
    }

}
