package de.tim0_12432.iterator;

public class List implements Aggregate {

    static class Node {
        private Node next = null;
        private final int value;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }
    }

    private Node head = null;

    public void append(int val) {
        if (head == null) {
            head = new Node(val);
        }
        Node cur = head;
        while (cur.getNext() != null) {
            cur = cur.getNext();
        }
        cur.setNext(new Node(val));
    }

    public List() {}

    public List(int ...values) {
        for (int val : values) {
            append(val);
        }
    }

    @Override
    public ListIterator iterator() {
        return new ListIterator(head);
    }
}
