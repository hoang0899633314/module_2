package ss4_kethua.BaiTap;

public class OldPhone extends Phone implements KhuyenMai {
    private String status;

    public OldPhone(String id, String name, double price, String status) {
        super(id, name, price);
        this.status = status;
    }

    @Override
    public double tinhTongGia() {
        return getPrice(); // Điện thoại cũ chỉ tính theo giá đơn lẻ
    }

    @Override
    public void khuyenMai(double phanTram) {
        double giam = getPrice() * phanTram / 100;
        setPrice(getPrice() - giam);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tình trạng: " + status;
    }
}
