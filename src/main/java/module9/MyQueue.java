package module9;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue<T> {
    Nodes<T> head;

    int size = 0;

    public MyQueue() {
        head = null;
    }

    public void add(T value) {
        Nodes<T> node = new Nodes<>(value);
        Nodes<T> secondNode = head;
        if (head == null) {
            head = node;
        } else {
            while (secondNode.next != null) {
                secondNode = secondNode.next;
            }
            secondNode.next = node;
            size++;
        }
    }

    public void clear() {
        Nodes<T> node = head;
        while (head != null & size != 0) {
            node.next = null;
            node.item = null;
            head = null;
            size--;
        }
    }

    public int size() {
        return size + 1;
    }

    @Override
    public String toString() {
        StringBuilder write = new StringBuilder();
        Nodes<T> node = head;
        if (node == null || node.item == null) {
            return "[]";
        } else while (node != null) {
            write.append(node.item).append(", ");
            node = node.next;
        }
        write.deleteCharAt(write.lastIndexOf(", "));
        String show = write.toString();
        return "[" + show.strip() + "]";
    }

    public Object peek(){
        Nodes<T> node = head;
        if (head != null){
            return  node.item;
        }
        return 0;
    }

    public T poll(){
        Nodes<T> node = head;
        T el = null;

        if(node == null) {
            return null;
        } else {
            while (node != null) {
                if( node == head) {
                    el = node.item;
                    node = node.next;
                    head = node;
                }
                node = node.next;
            }
            if (el == null)
                throw new NoSuchElementException();
        }
        size--;
        return el;
    }
}