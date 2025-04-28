
import java.util.Arrays;


public class ArrayList {
    int a[];
    int size;
    
    public ArrayList() {
        a = new int[3];
        size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        } else {
            return a[index];
        }
    }
    
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        } else {
            a[index] = value;
        }
    }
    
    public void addLast(int value) {
        ensureCapacity();
        a[size] = value;
        size++;
    }
    
    public void addByIndex(int value, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        } else if (size == index) {
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
    
    private void ensureCapacity() {
        if (size == a.length) {
            int temp[] = Arrays.copyOf(a, size * 2);
            a = temp;
        }
    }
    
    public int removeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        int x = a[index];
        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
        return x;
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(a[i]).append(" ");
        }
        return str.toString().trim();
    }
}
