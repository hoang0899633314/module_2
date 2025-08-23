package ss5_DaHinh.test;

public class Animal {
    public static void main(String[] args) {
        Student s1 = new Student("aaa", "Nam ", 3);
        Student s2 = new Student("aaa", "Nam ", 3);

        String str1 = new String("AAA");
        String str2 = new String("AAA");
        System.out.println(str1.equals(str2));


        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // Tự động gọi đến toString()
        System.out.println(s1.toString());
    }

    public void tiengKeu() {
        System.out.print("Dong vat keu: ");

    }


}
