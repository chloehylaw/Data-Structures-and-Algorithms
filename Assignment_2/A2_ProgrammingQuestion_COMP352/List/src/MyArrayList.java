import java.util.*;

class MyArrayList<E> implements List<E>{

    private int size = 0;
    private E[] listOfArray;
    public MyArrayList() {
        this.listOfArray = (E[]) new Object[10];
        this.size = 0;
    }

    // Appends the specified element to the end of this list
    @Override
    public boolean add(E e) {
        if (size >= listOfArray.length) {
            E[] bigger = (E[]) new Object[listOfArray.length * 2];
            System.arraycopy(listOfArray, 0, bigger, 0, listOfArray.length);
            listOfArray = bigger;
        } else if (size == (listOfArray.length)*0.25) {
            E[] bigger = (E[]) new Object[listOfArray.length /2];
            System.arraycopy(listOfArray, 0, bigger, 0, listOfArray.length);
            listOfArray = bigger;
        }
        listOfArray[size] = e;
        size++;
        return true;
    }

    // Inserts the specified element at the specified positions in the list
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        add(element);
        if (size - 1 - index >= 0) System.arraycopy(listOfArray, index, listOfArray, index + 1, size - 1 - index);

        listOfArray[index] = element;
    }

    // Removes all the elements from the list
    public void clear() {
        size = 0;
        listOfArray = null;
    }

    // Removes the element at the specified position in the list
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index_Details: " + index + ", Size of List " + index);
        }
        E element = get(index);
        if (size - 1 - index >= 0) System.arraycopy(listOfArray, index + 1, listOfArray, index, size - 1 - index);
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
    public boolean remove(Object o) {
        int index = 0;
        for (int i = 0; i<size; i++) {
            if (o.equals(listOfArray[i])) {
                index = i;
                break;
            }else{
                index= -1;
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

    // Returns a string representation of the list
    public String toString() {
        return "ArrayList\nSize: " + size + "\nlistOfArray: " + Arrays.toString(listOfArray);
    }

    // Returns the number of elements in the list
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

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return listOfArray[index];
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException();
    }


}