package ss4_kethua.BaiTap;

public abstract class Phone {
    private String id;
    private String name;
    private double price;

    public Phone(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Mỗi loại điện thoại có cách tính tổng giá riêng
    public abstract double tinhTongGia();

    @Override
    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Giá: " + price;
    }
}
