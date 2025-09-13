package ss8.Bai1.Cach2;

public class Main2 {
    public static void main(String[] args) {

        // Test stack dùng Array
        MyStack_Array<String> stack2 = new MyStack_Array<>();

        stack2.push("10");
        stack2.push("20");
        stack2.push("30");
        System.out.println("Array Stack peek: " + stack2.peek());
        System.out.println("Array Stack pop: " + stack2.pop());
        System.out.println("Array Stack size: " + stack2.size());
    }
}
