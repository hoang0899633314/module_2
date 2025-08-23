package ss4_kethua.BaiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    // Danh sách chứa cả điện thoại mới và cũ
    static ArrayList<Phone> phones = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Ứng dụng quản lý điện thoại =====");
            System.out.println("1. Thêm điện thoại mới");
            System.out.println("2. Thêm điện thoại cũ");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Xóa điện thoại theo ID");
            System.out.println("5. Sắp xếp theo giá");
            System.out.println("6. Tìm kiếm");
            System.out.println("7. Tính tổng tiền");
            System.out.println("8. Giảm giá điện thoại cũ");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: addNewPhone(); break;
                case 2: addOldPhone(); break;
                case 3: displayPhones(); break;
                case 4: deletePhone(); break;
                case 5: sortByPrice(); break;
                case 6: searchMenu(); break;
                case 7: tinhTongTien(); break;
                case 8: giamGiaDienThoaiCu(); break;
                case 0: System.out.println("Thoát chương trình!"); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    // ================== CHỨC NĂNG CƠ BẢN ==================

    public static void addNewPhone() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập thời gian bảo hành (tháng): ");
        int warranty = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        phones.add(new NewPhone(id, name, price, warranty, quantity));
        System.out.println("Đã thêm điện thoại mới!");
    }

    public static void addOldPhone() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập tình trạng: ");
        String status = scanner.nextLine();

        phones.add(new OldPhone(id, name, price, status));
        System.out.println("Đã thêm điện thoại cũ!");
    }

    public static void displayPhones() {
        if (phones.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("\n===== Danh sách điện thoại =====");
        for (Phone p : phones) {
            System.out.println(p);
        }
    }

    public static void deletePhone() {
        System.out.print("Nhập ID cần xóa: ");
        String id = scanner.nextLine();
        Phone target = null;
        for (Phone p : phones) {
            if (p.getId().equals(id)) {
                target = p;
                break;
            }
        }
        if (target != null) {
            phones.remove(target);
            System.out.println("Đã xóa thành công!");
        } else {
            System.out.println("Không tìm thấy ID!");
        }
    }

    // ================== CHỨC NĂNG 5: SẮP XẾP ==================

    public static void sortByPrice() {
        for (int i = 0; i < phones.size() - 1; i++) {
            for (int j = i + 1; j < phones.size(); j++) {
                if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                    Phone temp = phones.get(i);
                    phones.set(i, phones.get(j));
                    phones.set(j, temp);
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách theo giá tăng dần!");
        displayPhones();
    }

    // ================== CHỨC NĂNG 6: TÌM KIẾM ==================

    public static void searchMenu() {
        System.out.println("\n===== Tìm kiếm =====");
        System.out.println("1. Tìm theo loại (Cũ/Mới)");
        System.out.println("2. Tìm theo khoảng giá");
        System.out.println("3. Tìm theo tên");
        System.out.print("Chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Nhập loại (1: Cũ, 2: Mới): ");
                int type = Integer.parseInt(scanner.nextLine());
                searchByType(type == 1);
                break;
            case 2:
                System.out.print("Nhập giá min: ");
                double min = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập giá max: ");
                double max = Double.parseDouble(scanner.nextLine());
                searchByPriceRange(min, max);
                break;
            case 3:
                System.out.print("Nhập từ khóa tên: ");
                String keyword = scanner.nextLine();
                searchByName(keyword);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    public static void searchByType(boolean isOld) {
        System.out.println("===== Kết quả tìm kiếm theo loại =====");
        for (Phone p : phones) {
            if (isOld && p instanceof OldPhone) {
                System.out.println(p);
            } else if (!isOld && p instanceof NewPhone) {
                System.out.println(p);
            }
        }
    }

    public static void searchByPriceRange(double min, double max) {
        System.out.println("===== Kết quả tìm kiếm theo khoảng giá =====");
        for (Phone p : phones) {
            if (p.getPrice() >= min && p.getPrice() <= max) {
                System.out.println(p);
            }
        }
    }

    public static void searchByName(String keyword) {
        System.out.println("===== Kết quả tìm kiếm theo tên =====");
        for (Phone p : phones) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p);
            }
        }
    }

    // ================== CHỨC NĂNG 7: TÍNH TỔNG TIỀN ==================

    public static void tinhTongTien() {
        double tong = 0;
        for (Phone p : phones) {
            tong += p.tinhTongGia();
        }
        System.out.println("Tổng giá trị tất cả điện thoại: " + tong);
    }

    // ================== CHỨC NĂNG 8: GIẢM GIÁ ==================

    public static void giamGiaDienThoaiCu() {
        System.out.print("Nhập phần trăm giảm giá: ");
        double phanTram = Double.parseDouble(scanner.nextLine());
        for (Phone p : phones) {
            if (p instanceof OldPhone) {
                ((OldPhone) p).khuyenMai(phanTram);
            }
        }
        System.out.println("Đã giảm giá cho tất cả điện thoại cũ " + phanTram + "%");
    }
}
