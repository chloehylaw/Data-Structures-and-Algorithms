import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
class MyArrayList<E> implements List<E>{

    private static final int START_CAP = 10;
    private int size = 0;
    private E[] List_array;
    public MyArrayList() {
        List_array = (E[]) new Object[10];
        size = 0;
    }

    //definition of the method add()
    //appends the specified element to the end of the list.
    @Override
    public boolean add(E e) {
        if (size >= List_array.length) {
            E[] bigger = (E[]) new Object[List_array.length * 2];
            System.arraycopy(List_array, 0, bigger, 0, List_array.length);
            List_array = bigger;
        }

        else if (size == (List_array.length)*0.25) {
            E[] bigger = (E[]) new Object[List_array.length /2];
            System.arraycopy(List_array, 0, bigger, 0, List_array.length);
            List_array = bigger;
        }

        List_array[size] = e;
        size++;
        return true;
    }

    //definition of the method add()
    //inserts the specified element at the specified positions in the list
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        add(element);
        if (size - 1 - index >= 0) System.arraycopy(List_array, index, List_array, index + 1, size - 1 - index);

        List_array[index] = element;

    }

    //definition of the method clear()
    //removes all the elements from the list
    public void clear() {
        size = 0;
    }

    //definition of the method remove()
    //Removes the element at the specified position in the list
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index_Details: " + index + ", Size of List " + index);
        }

        E element = get(index);
        if (size - 1 - index >= 0) System.arraycopy(List_array, index + 1, List_array, index, size - 1 - index);

        size--;
        return element;
    }

    //definition of the method remove()
    //Removes the first occurrence of the specified element from the list
    @Override
    public boolean remove(Object o) {
        int index = 0;
        for (int i = 0; i<size; i++) {
            if (o.equals(List_array[i])) {
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


    //definition of the method toString()
    //Returns a string representation of the list
    public String toString() {
        return "MyArrayList\nSize: " + size + "\nList_array: " + Arrays.toString(List_array);
    }

    //definition of the method remove()
    //retuns the number of elements in the list
    public int size() {
        return size;
    }


    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return List_array[index];

    }

    //make the rest of the methods of the List interface
    // to throw the exception UnsupportedOperationException()
    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }
}