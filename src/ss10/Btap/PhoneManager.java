package ss10.Btap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneManager {
    private List<Phone> phones = new ArrayList<>();
    private final String fileName = "data.csv";

    public void addPhone(Phone p) {
        phones.add(p);
        System.out.println("✅ Added successfully!");
    }

    public void showAll() {
        if (phones.isEmpty()) {
            System.out.println("⚠ No phones available.");
        } else {
            phones.forEach(System.out::println);
        }
    }

    public void deleteById(String id) {
        phones.removeIf(p -> p.getId().equals(id));
        System.out.println("✅ Deleted phone with ID " + id);
    }

    public Phone findById(String id) {
        for (Phone p : phones) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    // ---------- Validation ----------
    public void validateField(String value, String fieldName) throws aaa.EmptyFieldException, aaa.MinLengthException {
        if (value == null || value.trim().isEmpty()) {
            throw new aaa.EmptyFieldException(fieldName + " cannot be empty!");
        }
        if (value.length() < 2) {
            throw new aaa.MinLengthException(fieldName + " must have at least 2 characters!");
        }
    }

    public void validatePrice(double price) throws aaa.NegativeNumberException {
        if (price < 0) {
            throw new aaa.NegativeNumberException("Price cannot be negative!");
        }
    }

    // ---------- File IO ----------
    public void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Phone p : phones) {
                bw.write(p.toCSV());
                bw.newLine();
            }
            System.out.println("💾 Saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFromFile() {
        phones.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals("NewPhone")) {
                    phones.add(new NewPhone(parts[1], parts[2], Double.parseDouble(parts[3]), Integer.parseInt(parts[4])));
                } else if (parts[0].equals("OldPhone")) {
                    phones.add(new OldPhone(parts[1], parts[2], Double.parseDouble(parts[3]), parts[4]));
                }
            }
            System.out.println("📂 Loaded data from file!");
        } catch (IOException e) {
            System.out.println("⚠ No existing data file.");
        }
    }
}
