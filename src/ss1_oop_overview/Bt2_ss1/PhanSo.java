package ss1_oop_overview.Bt2_ss1;

import java.util.Scanner;

public class  PhanSo {
    int tuSo;
    int mauSo;

    //Phương thức nhập phân số từ bàn phím
    void nhap() {
        Scanner scanner = new Scanner(System.in);

        // Nhập tử số
        System.out.println("Nhập tử số: ");
        tuSo = scanner.nextInt();

        // Nhập mẫu số và k.tra khác không
        do {
            System.out.println("Nhập mẫu số: ");
            mauSo = scanner.nextInt();
        } while (mauSo == 0);
    }

    //Phương thức rút gọn phân số
    void rutGon() {
        int ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        // Đẩm bảo mẫu số luôn là dương
        if (mauSo < 0) {
            tuSo = -mauSo;
            mauSo = -mauSo;
        }
    }

    //Tìm ước chung lớn nhất
    int uocChungLonNhat(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 & b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    // Phương thức xuất phân số ở dạng rút gọn
    void xuat() {
        rutGon();
        if (mauSo == 1) {
            System.out.println(tuSo); // Nếu mấu số là 1, chỉ cần xuất tử số.
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }

    //Phương thức tổng hai phân số
    PhanSo cong(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo + phanSoKhac.tuSo * this.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    //Phương thức tổng hai phân số
    PhanSo hieu(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo - phanSoKhac.tuSo * this.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    //Phương thức tích hai phân số
    PhanSo tich(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.tuSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    //Phương thức Thương hai phân số
    PhanSo thuong(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = this.tuSo * phanSoKhac.mauSo;
        ketQua.mauSo = this.mauSo * phanSoKhac.tuSo;
        return ketQua;
    }

    // Kiểm tra phân số dương
    boolean laPhanSoDuong() {
        return tuSo * mauSo > 0 || tuSo == 0;
        // Nếu tử số và mẫu số cùng dầu hoặc tử số = 0 ==>> phân số dương
    }

    // Phương thức kiểm tra phân số bằng 0
    boolean laPhanSoKhong() {
        return tuSo == 0;
        // Nếu tử số bằng 0 ==>> phân số bằng 0
    }


}

