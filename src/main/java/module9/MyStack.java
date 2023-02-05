package module9;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MyStack<T> {

    Object[] array;

    public MyStack() {
        array = new Object[0];
    }

    public Object[] push(T value) {
        int size = array.length;
        size++;
        Object[] secondArray = Arrays.copyOf(array, size);
        for (int i = array.length; i < size; i++) {
            secondArray[i] = value;
        }
        return array = secondArray;
    }


    public Object[] remove(int index) {
        int size = array.length;
        size--;
        int element = 0;
        Object[] secondArray = new Object[size];
        for (int i = 0; i < size; i++) {
            if (i == index) {
                element++;
            }
            secondArray[i] = array[element];
            element++;
        }
        return array = secondArray;
    }

    public Object[] clear() {
        if (array.length != 0)
            return new Object[0];
        else throw new UnsupportedOperationException();
    }

    public int size() {
        return array.length;
    }

    public Object peek() {
        for (Object o : array) {
            return o;
        }
        return null;
    }

    public Object pop() {
        Object el = null;
        for (Object o : array) {
            el = o;
            break;
        }
        remove(0);
        return el;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
