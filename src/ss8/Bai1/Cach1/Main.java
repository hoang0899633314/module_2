package ss8.Bai1.Cach1;

public class Main {

    public static void main(String[] args) {
        // Test stack dùng LinkedList
        MyStack_Linked<Integer> stack1 = new MyStack_Linked<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println("LinkedList Stack peek: " + stack1.peek()); // 30
        System.out.println("LinkedList Stack pop: " + stack1.pop());   // 30
        System.out.println("LinkedList Stack size: " + stack1.size()); // 2

    }
}

