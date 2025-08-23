package ss4_kethua.BaiTap;

public class NewPhone extends Phone {
    private int warranty;
    private int quantity;

    public NewPhone(String id, String name, double price, int warranty, int quantity) {
        super(id, name, price);
        this.warranty = warranty;
        this.quantity = quantity;
    }

    @Override
    public double tinhTongGia() {
        return getPrice() * quantity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bảo hành: " + warranty + " tháng, SL: " + quantity;
    }
}
