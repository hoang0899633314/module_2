package ss7.test;

public class MyArrayList {
    private int capacity; // Kích thước thực tế (khng cho người dùng biết)

    private int size; // Số phần tử add vào (Show ra cho người dùng)

    private int[] elementData;

    private final int[] emptyArray = {}; // tái sử dụng nhiều lần

    public MyArrayList() {
        elementData = emptyArray;
    }

    public void add(int element) {
        // Bước 1: elementData == emptyArray
        if (elementData == emptyArray) { // Thông qua default constructor (lần đầu)
            capacity = 10;
            elementData = new int[capacity];
        }

        // Bước 2: Kiểm tra size == capacity
        if (size == capacity) {
            // Tránh trường hợp capacity = 0
            if (capacity == 0) {
                capacity = 1;
            } else if (capacity == 1) { //Tránh trườngh hợp capacity = 1
                capacity = 2;
            } else {
                // Tạo ra mảng mới gấp 50%
                capacity = (int) (capacity * 1.5);
            }

            int[] temp = new int[capacity];

            // đổ dữ liệu qua mảng mới
            for (int i = 0; i < elementData.length; i++) {
                temp[i] = elementData[i];
            }

            // tham chiếu vùng nhớ mới
            elementData = temp;
        }

        // Bước 3: size < capacity ==> add phần tử vào
        elementData[size] = element;
        size++;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementData[i]).append("\t");
        }
        return stringBuilder.toString();
    }
}
