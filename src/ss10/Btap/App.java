package ss10.Btap;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneManager manager = new PhoneManager();
        manager.loadFromFile();

        while (true) {
            System.out.println("\n===== CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI =====");
            System.out.println("1. Thêm điện thoại mới");
            System.out.println("2. Xem danh sách điện thoại");
            System.out.println("3. Xóa điện thoại theo ID");
            System.out.println("4. Tìm điện thoại theo ID");
            System.out.println("5. Lưu dữ liệu ra file");
            System.out.println("0. Thoát");
            System.out.print("👉 Chọn chức năng: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("1. Thêm Điện thoại Mới");
                        System.out.println("2. Thêm Điện thoại Cũ");
                        System.out.print("👉 Chọn loại: ");
                        int type = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nhập mã ID: ");
                        String id = sc.nextLine();
                        manager.validateField(id, "ID");

                        System.out.print("Nhập Tên điện thoại: ");
                        String name = sc.nextLine();
                        manager.validateField(name, "Tên");

                        System.out.print("Nhập Giá bán: ");
                        double price;
                        try {
                            price = Double.parseDouble(sc.nextLine());
                            manager.validatePrice(price);
                        } catch (NumberFormatException e) {
                            System.out.println("❌ Giá bán phải là số!");
                            continue; // quay lại menu
                        }


                        if (type == 1) {
                            System.out.print("Nhập Thời gian bảo hành (tháng): ");
                            int warranty;
                            try {
                                warranty = Integer.parseInt(sc.nextLine());
                            } catch (NumberFormatException e) {
                                System.out.println("❌ Thời gian bảo hành phải là số nguyên!");
                                continue;
                            }

                            sc.nextLine();
                            manager.addPhone(new NewPhone(id, name, price, warranty));
                        } else {
                            System.out.print("Nhập Tình trạng (mô tả): ");
                            String condition = sc.nextLine();
                            manager.validateField(condition, "Tình trạng");
                            manager.addPhone(new OldPhone(id, name, price, condition));
                        }
                        break;

                    case 2:
                        System.out.println("📋 DANH SÁCH ĐIỆN THOẠI:");
                        manager.showAll();
                        break;

                    case 3:
                        System.out.print("Nhập ID cần xóa: ");
                        String delId = sc.nextLine();
                        manager.deleteById(delId);
                        break;

                    case 4:
                        System.out.print("Nhập ID cần tìm: ");
                        String findId = sc.nextLine();
                        Phone found = manager.findById(findId);
                        if (found != null) {
                            System.out.println("🔎 Tìm thấy: " + found);
                        } else {
                            System.out.println("❌ Không tìm thấy!");
                        }
                        break;

                    case 5:
                        manager.saveToFile();
                        break;

                    case 0:
                        System.out.println("👋 Thoát chương trình...");
                        manager.saveToFile();
                        return;

                    default:
                        System.out.println("⚠ Lựa chọn không hợp lệ, vui lòng nhập lại!");
                }
            } catch (aaa.EmptyFieldException | aaa.MinLengthException | aaa.NegativeNumberException e) {
                System.out.println("❌ Lỗi: " + e.getMessage());
            }
        }
    }
}
