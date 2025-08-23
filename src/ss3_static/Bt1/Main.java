package ss3_static.Bt1;

public class Main {
    public static void main(String[] args) {
        //Tạo các đối tượng sinh viên
        Student sd1 = new Student(1, "Jason", 90);
        Student sd2 = new Student(2, "Biado", 95);
        Student sd3 = new Student(3, "Gorst", 96);

        System.out.println("Số lươg sinh viên: " + Student.getStudentCount());
    }
}
