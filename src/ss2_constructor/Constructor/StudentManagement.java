package ss2_constructor.Constructor;

public class StudentManagement {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        Student s1 = new Student("Nam", 12, "Nữ");
//        Student s2 = new Student("JASON" );
//
//        s1.output();
//        s2.output();
        Student student = new Student();

        student.setAge(-1);
        System.out.println("Số tuổi: " + student.getAge());
    }
}
