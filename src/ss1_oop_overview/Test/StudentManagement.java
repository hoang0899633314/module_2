package ss1_oop_overview.Test;

import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        //Nhập vào số lượng học sinh
        int n = 100000; // Sử dụng do-while

        ArrayList<Student> students = new ArrayList<>(n);

        Student student;
        for (int i = 1; i <= n; i++) {
            System.out.printf("\n\n==== Nhập vào thông tin sinh viên thứ %d ====\n", i);
            student = new Student();
            student.input();
            students.add(student);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("\n\n=====Thông tin sinh viên thứ %d ====\n", i + 1);
            students.get(i).output();
        }

    }
}
