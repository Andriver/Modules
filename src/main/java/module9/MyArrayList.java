package module9;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] array;

    public MyArrayList() {
        array = new Object[0];
    }

    public Object[] add(T value) {
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

    public void clear() {
        array = new Object[0];
    }

    public int size() {
        return array.length;
    }

    public Object get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                return array[i];
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}