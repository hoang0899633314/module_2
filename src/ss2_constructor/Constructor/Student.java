package ss2_constructor.Constructor;

import java.util.Scanner;

public class Student {

    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public Student(String name1) {
        this.name = name1;
    }

    public Student() {

    }

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên: ");
        name = scanner.nextLine();

        System.out.print("Nhập vào tuổi: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào giới tính: ");
        gender = scanner.next();
    }

    void output() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            // Nén ngoại lệ
            System.out.println("Tuổi không hợp lệ");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
