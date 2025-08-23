package ss5_DaHinh.study;

public class main {
    public static void main(String[] args) {
        HocVien hocVien1 = new ChuyenVien();
        HocVien hocVien2 = hocVien1;
        ChuyenVien hocVien3 = (ChuyenVien) hocVien2;
        NVChinhThuc hocVien4 =  hocVien3;
        HocVien hocVien5 = hocVien3;
        HocVien hocVien6 = (HocVien) hocVien2;
        HocVien hocVien7 = (NVQuanLy) hocVien6;
        NVChinhThuc hocVien8 = (NVChinhThuc) hocVien7;


        /*
        compile: Quan tâm phía bên tay trái (cha về con được)
        runtime: Quan tâm phía bên tay phải (cha không thể về con)
         */
    }
}
