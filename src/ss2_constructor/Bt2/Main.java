package ss2_constructor.Bt2;

public class Main {
    public static void main(String[] args) {
        ThoiGian tg = new ThoiGian();
        tg.xuat();

        ThoiGian tg1 = new ThoiGian(3);
        tg1.xuat();

        ThoiGian tg2 = new ThoiGian(3, 35);
        tg2.xuat();

        ThoiGian tg3 = new ThoiGian(3, 35, 55);
        tg3.xuat();

        ThoiGian tg4 = new ThoiGian(tg3);
        tg2.xuat();
    }
}
