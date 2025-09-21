package ss9.Bt2;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

    // a. Đếm số lần xuất hiện của từ trong văn bản
    public static void demTu(String text) {
        text = text.toLowerCase(); // bỏ phân biệt hoa/thường
        String[] words = text.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Số lần xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // b. Kiểm tra tính duy nhất của tên
    public static void kiemTraTen(String[] names) {
        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : names) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        System.out.println("Kết quả kiểm tra tên:");
        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " -> duy nhất");
            } else {
                System.out.println(entry.getKey() + " -> xuất hiện " + entry.getValue() + " lần");
            }
        }
    }
}


