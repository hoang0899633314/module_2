package ss4_kethua.Test;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
        super();
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // input
    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tuổi: ");
        this.score = Double.parseDouble(scanner.nextLine());
    }
}
