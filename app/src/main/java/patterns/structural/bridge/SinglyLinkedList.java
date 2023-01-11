package patterns.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Concrete implementor. Classing LinkedList using nodes **NOT THREAD SAFE**
 */
public class SinglyLinkedList <T> implements LinkedList<T>
{
    @AllArgsConstructor
    private static class Node
    {
        private Object data;
        private Node next;

    }

    @Getter
    private int size;
    private Node top;
    private Node last;

    @Override public void addFirst (final T element) {
        if (top == null) {
            last = top = new Node (element, null);
        } else {
            top = new Node (element, top);
        }
        size++;
    }

    @Override public T removeFirst () {
        if (top == null) {
            return null;
        }
        @SuppressWarnings ("unchecked")
        T temp = (T) top.data;
        if (top.next != null) {
            top = top.next;
        } else {
            top = null;
            last = null;
        }
        size--;
        return temp;
    }

    @Override public void addLast (final T element) {
        if (last == null) {
            last = top = new Node (element, null);
        } else {
            last.next = new Node (element, null);
            last = last.next;
        }
        size++;
    }

    @Override public T removeLast () {
        if (last == null) {
            return null;
        }
        if (top == last) {
            @SuppressWarnings ("unchecked")
            T temp = (T) top.data;
            top = last = null;
            size--;
            return temp;
        }

        // no back pointer
        Node temp = top;
        while (temp.next != last) {
            temp = temp.next;
        }

        @SuppressWarnings ("unchecked")
        T result = (T) last.data;
        last = temp;
        last.next = null;
        size--;
        return result;
    }

    @Override public String toString () {
        StringBuilder result = new StringBuilder ("[");
        Node temp = top;
        while (temp != null) {
            result.append (temp.data).append (temp.next == null ? "" : ", ");
            temp = temp.next;
        }
        result.append ("]");
        return result.toString ();
    }
}
