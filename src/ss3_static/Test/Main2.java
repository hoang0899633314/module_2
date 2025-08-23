package ss3_static.Test;

public class Main2 {
    static int a = 2; //thuộc về toàn bộ đối tượng
    int b = 2; // thuộc riêng cho từng đối tượng

    public static void main(String[] args) {
        Main2 s1 = new Main2();
        Main2 s2 = new Main2();

        s1.a++; // 3
        s1.b++; // 3 => s1

        s2.a++; // 4 => chung cho toàn bộ đối tượng
        s2.b++; // 3
        System.out.println(s1.a);
        System.out.println(s1.b);
    }
}
