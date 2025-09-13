package ss8.Bai1.Cach2;

public class MyStack_Array<E> {
    private int capacity;   // dung lượng thực tế
    private Object[] elementData; // mảng lưu dữ liệu
    private int size;       // số phần tử hiện có

    private static final int DEFAULT_CAPACITY = 10;

    public MyStack_Array() {
        elementData = new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Tự tăng capacity khi đầy
    private void ensureCapacity() {
        if (size == capacity) {
            capacity = (capacity == 0) ? 1 : capacity * 2;
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = elementData[i];
            }
            elementData = newArr;
        }
    }

    // push: thêm vào đỉnh stack
    public void push(E element) {
        ensureCapacity();
        elementData[size++] = element;
    }

    // pop: lấy và xóa phần tử trên đỉnh
    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack rỗng!");
            return null;
        }
        E value = (E) elementData[--size];
        elementData[size] = null; // tránh memory leak
        return value;
    }

    // peek: xem phần tử trên đỉnh mà không xóa
    public E peek() {
        if (isEmpty()) {
            System.out.println("Stack rỗng!");
            return null;
        }
        return (E) elementData[size - 1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: ");
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]).append(" ");
        }
        return sb.toString();
    }
}
