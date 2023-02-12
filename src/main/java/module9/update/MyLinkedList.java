package module9.update;

import java.util.Objects;

public class MyLinkedList<T> {
    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T elements) {
            this.element = elements;
        }
    }

    private Node<T> first;
    private Node<T> last;
    private int size;


    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = this.last = newNode;
        } else {
            this.last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void add(int index, T element) {
        Objects.checkIndex(index, size+1);
        Node<T> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else if  (index == 0) {
            newNode.next = first;
            first = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public T remove(int index) {
        Objects.checkIndex(index,size);
        T removedElement;
        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<T> prev = getNodeByIndex(index - 1);
            removedElement = prev.next.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return removedElement;
    }

    public void clear() {
        first = last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).element;
    }
}