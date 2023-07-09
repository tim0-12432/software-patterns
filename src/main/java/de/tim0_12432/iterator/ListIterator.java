package de.tim0_12432.iterator;

public class ListIterator implements Iterator<Integer> {

    List.Node cur = null;

    public ListIterator(List.Node head) {
        cur = head;
    }

    @Override
    public Integer next() {
        cur = cur.getNext();
        return cur.getValue();
    }

    @Override
    public boolean hasNext() {
        return cur.getNext() != null;
    }
}
