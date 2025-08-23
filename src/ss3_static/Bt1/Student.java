package ss3_static.Bt1;

public class Student {
    private int id;
    private String name;
    private double score;
    private static int studentCount = 0; // Biến tĩnh để đếm số lượng sinh viên.

    // Constructor
    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        studentCount++; // tăng giá trị của studentCount lên 1 mỗi khi một đối tượng mới được tạo.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // Phương thức tỉnh để truy xuất số lượng sinh viên
    public static int getStudentCount() {
        return studentCount;
    }

}
