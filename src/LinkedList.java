public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        initializeNewList(value);
    }

    public void append(int value) {
        if (head == null) {
            initializeNewList(value);
        } else {
            Node newNode = new Node(value);
            tail.setNext(newNode);
            tail = newNode;
            length += 1;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0)
            return null;
        Node lastNode = head;
        Node prevNode = head;
        while (lastNode.getNext() != null) {
            prevNode = lastNode;
            lastNode = lastNode.getNext();
        }
        tail = prevNode;
        tail.setNext(null);
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return lastNode;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node firstNode = head;
        head = head.getNext();
        length--;
        if (length == 0) tail = null;
        return firstNode;
    }

    public void initializeNewList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node get(int index) {
        if (length < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getNext();
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.getValue());
    }

    public void getTail() {
        System.out.println("Tail: " + tail.getValue());
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
