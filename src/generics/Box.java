package generics;

public class Box<E> {
    E value;

    private Box() {
        value = null;
    }

    private Box(E v) {
        value = v;
    }

    public static <B, E extends B> Box<B> box(E e) {
        return new Box<B>(e);
    }

    public static void main(String[] args) {
        Box<CharSequence> bcs = Box.box("hello");
    }
}
