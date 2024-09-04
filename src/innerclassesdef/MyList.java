package innerclassesdef;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class MyList<E> implements Iterable<E> {

    private E[] data = (E[]) (new Object[10]);
    private int count = 0;

    public void add(E e) {
        data[count++] = e;
    }

    @Override
    public String toString() {
        return Arrays.stream(data)
                .limit(count)
                .map(Object::toString)
                .collect(Collectors.joining(", ", "MyList[", " ]"));
    }

    private class MyIterator implements Iterator<E> {
        private int progress = 0;

        @Override
        public boolean hasNext() {
            return progress < count;
        }

        @Override
        public E next() {
            return data[progress++];
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }
}
