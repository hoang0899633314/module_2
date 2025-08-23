package ss3_static.Bt3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {

    // Định dạng chuỗi ngày tháng dd/MM/yyyy
    private final static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Định dạng chuỗi ngày tháng yyyy/MM/dd
    private final static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    // Phương thức tĩnh để chuyển đổi dd/MM/yyyy thành LocalDate
    public static LocalDate fromString_ddMMyyyy(String date) {
        // Sử dụng DateTimeFormatter để phân tích chuỗi thành LocalDate
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    // Phương thức tĩnh để chuyển đổi yyyy/MM/dd thành LocalDate
    public static LocalDate fromString_yyyyMMdd(String date) {
        // Sử dụng DateTimeFormatter để phân tích chuỗi thành LocalDate
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }

    // Phương thức tĩnh để chuyển đổi LocalDate thành chuỗi dd/MM/yyyy
    public static String toString_ddMMyyyy(LocalDate date) {
        // Sử dụng DateTimeFormatter để định dạng LocalDate thành chuỗi
        return date.format(formatter_ddMMyyyy);
    }

    // Phương thức tĩnh để chuyển đổi LocalDate thành chuỗi yyyy/MM/dd
    public static String toString_yyyyMMdd(LocalDate date) {
        // Sử dụng DateTimeFormatter để định dạng LocalDate thành chuỗi
        return date.format(formatter_yyyyMMdd);
    }
}
