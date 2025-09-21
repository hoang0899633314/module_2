package ss9.Bt2;

public class Main2 {
    public static void main(String[] args) {
        String text = "học Java thật vui và Java thật dễ";
        String[] names = {"An", "Bình", "An", "Hà", "Nam", "Bình", "Lan"};

        // a. Đếm từ trong văn bản.
        Map1.demTu(text);
        System.out.println("--------------------------");

        // b. Kiểm tra tính duy nhất của tên.
        Map1.kiemTraTen(names);
    }
}
