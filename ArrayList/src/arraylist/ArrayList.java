package arraylist;

import java.util.Arrays;

public class ArrayList<T> {
    private T[] a;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        a = (T[]) new Object[3];
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Index " + index);
        return a[index];
    }

    public void set(int index, T value) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Index " + index);
        else
            a[index] = value;
    }

    private void ensureCapacity() {
        if (size == a.length) {
            a = Arrays.copyOf(a, size * 2); // مضاعفة حجم المصفوفة
        }
    }

    public void addLast(T value) {
        ensureCapacity();
        a[size] = value;
        size++;
    }

    public void addByIndex(T value, int index) {
        if (index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException("Index " + index);
        else if (index == size) {
            addLast(value);
        } else {
            ensureCapacity();
            for (int i = size - 1; i >= index; i--) {
                a[i + 1] = a[i];
            }
            a[index] = value;
            size++;
        }
    }

    public T removeLast() {
        if (size == 0)
            throw new ArrayIndexOutOfBoundsException("List is empty");
        T value = a[size - 1];
        a[size - 1] = null; 
        size--;
        return value;
    }

    public T removeByIndex(int index) {
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Index " + index);
        else {
            T x = a[index];
            for (int i = index; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            a[size - 1] = null; 
            size--;
            return x;
        }
    }


}
