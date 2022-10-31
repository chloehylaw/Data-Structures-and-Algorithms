import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
    private int size;
    private Node head;

    private class Node {
        public E item;
        public Node next;

        public Node(E item) {
            this.item = item;
            this.next = null;
        }

        public Node(E item, Node next) {
            this.item = item;
            this.next = next;
        }

        public String toString() {
            return "Node: " + item.toString();
        }
    }

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // Appends the specified element to the end of the list.
    @Override
    public boolean add(E e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node node = head;
            for (; node.next != null; node = node.next) {

            }
            node.next = new Node(e);
        }

        size++;
        return true;
    }

    // Inserts the specified element at the specified positions in the list
    @Override
    public void add(int index, E element) {
        if (index == 0) {
            head = new Node(element, head);
        } else {
            Node node = getNode(index - 1);
            node.next = new Node(element, node.next);
        }

        size++;
    }

    // Removes all the elements from the list
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    // Removes the element at the specified position in the list
    @Override
    public E remove(int index) {
        E element = get(index);
        if (index == 0) {
            head = head.next;
        } else {
            Node node = getNode(index - 1);
            node.next = node.next.next;
        }
        size--;
        return element;
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    // Removes the first occurrence of the specified element from the list
    @Override
    public boolean remove(Object obj) {
        int index = 0;
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (equals(obj, node.item)) {
                index = i;
                break;
            } else {
                node = node.next;
                index = -1;
            }
        }
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "MyLinkedList\nSize:" + size + "\nHead:" + head;
    }

    // Retuns the number of elements in the list
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    private boolean equals(Object target, Object element) {
        if (target == null) {
            return element == null;
        } else {
            return target.equals(element);
        }
    }




}