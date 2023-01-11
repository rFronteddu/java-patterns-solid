package patterns.structural.bridge;

import lombok.Getter;

/**
 * Concrete implementor. This implementation uses arrays to implement linked list.
 * **This is just a mocket list, not something ready for production**.
 */
public class ArrayLinkedList <T> implements LinkedList<T>
{
    private static final int DEFAULT_SIZE = 2;
    private Object[] data;
    @Getter
    private int size;

    public ArrayLinkedList () {
        data = new Object[DEFAULT_SIZE];
    }

    @Override public void addFirst (T element) {
        ensureCapacity (++size);
        shiftOneRight ();
        data[0] = element;
    }

    @Override public T removeFirst () {
        if (size == 0) {
            return null;
        }
        @SuppressWarnings ("unchecked")
        T fist = (T) data[0];
        size--;
        shiftOneLeft ();
        return fist;
    }

    @Override public void addLast (T element) {
        ensureCapacity (size + 1);
        data[size++] = element;
    }

    @SuppressWarnings ("unchecked")
    @Override public T removeLast () {
        if (size == 0) {
            return null;
        }
        return (T) data[size--];
    }

    private void ensureCapacity (final int newSize) {
        if (data.length > newSize) {
            return;
        }
        Object[] temp = new Object[data.length + DEFAULT_SIZE];
        System.arraycopy (data, 0, temp, 0, data.length);
        data = temp;
    }

    public void shiftOneRight () {
        System.arraycopy (data, 0, data, 1, size);
    }

    public void shiftOneLeft () {
        System.arraycopy (data, 1, data, 0, size);
    }

    @Override public String toString () {
        StringBuilder result = new StringBuilder ("[");
        for (int i = 0; i < size; i++) {
            result.append (data[i]).append (i == size - 1 ? "" : ", ");
        }
        result.append ("]");
        return result.toString ();
    }

}
