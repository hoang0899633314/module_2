package ss3_static.Test;

public class Main {
    static int a = 10; // thuôc về đối tương
    // thuộc về class khi thêm static ( Chung cho tất cả các đối tượng cùng loại )

    public static void main(String[] args) {
        // static / non-static
        System.out.println(a);
        // Vì sao static không thể gọi non-static
    }

    void changeData() { // non-static => thuộc về đối tượng
        a = 100;

    }
}
