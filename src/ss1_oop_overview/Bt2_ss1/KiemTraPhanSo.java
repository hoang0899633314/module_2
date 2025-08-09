package ss1_oop_overview.Bt2_ss1;

public class KiemTraPhanSo {
    public static void main(String[] args) {
        PhanSo phanso1 = new PhanSo();
        PhanSo phanso2 = new PhanSo();

        System.out.println("Nhập phân số thứ nhất: ");
        phanso1.nhap();

        System.out.println("Nhập phân số thứ hai: ");
        phanso2.nhap();

        System.out.println("Phân số thứ nhất: ");
        phanso1.xuat();

        System.out.println("Phân số thứ hai: ");
        phanso2.xuat();

        System.out.println("Tổng hai phân số: ");
        PhanSo tong = phanso1.cong(phanso2);
        tong.xuat();

        System.out.println("Hiệu hai phân số: ");
        PhanSo hieu = phanso1.hieu(phanso2);
        hieu.xuat();

        System.out.println("Tích hai phân số: ");
        PhanSo tich = phanso1.tich(phanso2);
        tich.xuat();

        System.out.println("Thương hai phân số: ");
        PhanSo thuong = phanso1.thuong(phanso2);
        thuong.xuat();

        // Kiểm tra phân số thứ nhất là dương hay không
        System.out.println("Phân số thứ nhất là phân số " + (phanso1.laPhanSoDuong() ? "dương" : "âm") + ".");

        // Kiểm tra phân số thứ hai là dương hay không
        System.out.println("Phân số thứ hai là phân số " + (phanso2.laPhanSoDuong() ? "dương" : "âm") + ".");

        // Kiểm tra xem phân số thứ nhất là phân số bằng 0 hay không
        System.out.println("Phân số thứ nhất " + (phanso1.laPhanSoKhong() ? "bằng không" : "không bằng không"));

        // Kiểm tra xem phân số thứ hai là phân số bằng 0 hay không
        System.out.println("Phân số thứ hai " + (phanso2.laPhanSoKhong() ? "bằng không" : "không bằng không"));

    }
}
