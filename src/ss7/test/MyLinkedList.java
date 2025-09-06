package ss7.test;

public class MyLinkedList {
    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int size;

    public void addFrist(int element) {
        Node nodeNew = new Node(element);

        if (head == null) { // Trường hợp danh sách rỗng
            head = tail = nodeNew;
        } else {
            nodeNew.next = head;
            head = nodeNew;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}
