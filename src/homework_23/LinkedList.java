package homework_23;

public class LinkedList implements List {

    int size;
    Node head;

    public LinkedList() {

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int get(int index) {
        Node node = head;
        if (index < size) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node.val;
        }
        throw new IndexOutOfBoundsException("ERROR");
    }

    @Override
    public void add(int val) {

        if (head == null) {
            head = new Node(val);
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(val);
        }
        size++;
    }

    @Override
    public void add(int index, int val) {
        if (index > size) {
            throw new IndexOutOfBoundsException("ERROR");
        } else {
            Node node = head;
            if (index == 0) {
                head = new Node(val, node);
            } else {
                for (int i = 0; i < index - 1; i++) {
                    node = node.next;
                }
                node.next = new Node(val, node.next);
            }
            size++;
        }
    }

    @Override
    public String toString() {
        Node node = head;
        StringBuilder str = new StringBuilder();
        if (node != null) {
            str.append(node.toString());
            while (node.next != null) {
                str.append(node.next.toString());
                node = node.next;
            }
        }
        return "{"+str.toString()+"null}";
    }

    void delete(int index) {
        if (index > size || size == 0) {
            throw new IndexOutOfBoundsException("ERROR");
        } else {
            if (index == 0) {
                head = head.next;
            } else {
                Node node = head;
                for (int i = 0; i < index - 1; i++) {
                    node = node.next;
                }
                node.next = node.next.next;
            }
        }
        size--;
    }

    class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + val + "->";
        }
    }


}
