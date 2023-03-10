package Unit11;

public class CustomArrayList<T> implements CustomList<T> {
    Object[] items = new Object[10];
   int size = 0;
    @Override
    public void add(T item) {
        items[size++] = item;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        return (T) items[index];
    }
}
