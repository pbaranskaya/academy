package by.academy.lesson15;

import java.util.Iterator;

public class LinkedList<T>  implements  Iterable<T> {

    private Node<T> head;
    private Node<T> tail;

    int size;

    public void add(T value) {
        if (tail == null) {
            Node<T> newNode = new Node<>(value, null, null);
            head = newNode;
            tail = newNode;
            size++;
            return;
        }

        Node<T> newNode = new Node<>(value, null, tail);
        tail.next = newNode;
        tail = newNode;
        size++;

    }

    public void remove(int index) {

        if (index < 0 || index >= size) {
            System.err.println("Index out of bound exception");
        }

        if (index == 0) {
            removeHead();
        } else if (index == size - 1) {
            removeTail();
        } else {
            Node<T> current = getNode(index);
            if (current == null) {
                System.err.println("Index out of bound exception. Size: " + size + " " + "Index: " + index);
                return;
            }
            Node<T> prev = current.prev;
            Node<T> next = current.next;

            prev.next = next;
            next.prev = prev;

            current.next = null;
            current.prev = null;
            current = null;
            size--;
        }
    }

    public void removeTail() {
        if (size > 0) {
            Node<T> c = head.next;

            if (c == null) {
                head = null;
                tail = null;

            } else {
                Node<T> d = tail.prev;
                d.next = null;
                tail.prev = null;
                tail = d;
            }
            size--;
        }
    }

    public void removeHead() {
        if (size > 0) {
            Node<T> c = head.next;

            if (c == null) {
                head = null;
                tail = null;

            } else {
                Node<T> d = head.next;
                d.prev = null;
                head.next = null;
                head = d;

            }
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index > size) {
            System.err.println("неправильный индекс size " + size + " index " + index);
            return null;
        }
        int counter = 0;
        Node<T> current = head;

        do {

            if (index == counter) {
                return current;
            }
            current = current.next;
            counter++;
        } while (current != null);

        return null;
    }

    public T get(int index) {
        Node<T> node = getNode(index);
        return node != null ? node.value : null;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                Node<T> node = current;
                current = current.next;
                return node.value;
            }
        };
    }

    public class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T val, Node<T> next, Node<T> prev) {
            this.next = next;
            this.prev = prev;
            this.value = val;
        }
    }


}



