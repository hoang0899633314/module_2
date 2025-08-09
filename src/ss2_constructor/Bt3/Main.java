package ss2_constructor.Bt3;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Student
        Student student1 = new Student(1, "Carlo Biado", 9);

        // Kiểm tra thông tin ban đầu
        System.out.println("Thông tin ban đầu:");
        System.out.println("Id: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Score: " + student1.getScore());

        // Thử nghiệm việc cập nhật thông tin
        student1.setName("Biado");
        student1.setScore(9);

        // Kiểm tra thông tin sau khi cập nhật
        System.out.println("\nThông tin sau khi cập nhật: ");
        System.out.printf("Id: " + student1.getId());
        System.out.printf("Name: " + student1.getName());
        System.out.printf("Score: " + student1.getScore());

        // Thử nghiệm cập nhật thông tin không hợp lệ
        student1.setName("      "); // Tên không hợp l
        student1.setScore(15); // Điểm không hợp lệ

    }
}
