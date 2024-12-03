package generics;

import java.time.LocalDate;

public class Pair<E> {
    private E left;
    private E right;

    public Pair(E left, E right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public void setLeft(E left) {
        this.left = left;
    }

    public E getRight() {
        return right;
    }

    public void setRight(E right) {
        this.right = right;
    }

    private E thing;

//    Using declared Generics on method or class are correct
    public <U> void doStuff(E e, U u) {
    }

    public static <U> void doMore(/*E e, cant reference a non-static member from a static member*/ U u) {
    }

    public static <W, X/*Can declare types and not use them*/> void doLess(W w) {
    }

    private class H {void doStuff(E e) {}}

//    inner interfaces are implicit static therefore cant instantiate a non-static member
//    public interface J {void doStuff(E e);}}
}

//Generic types can be passed to a generic parent type
class TextPair<F extends CharSequence> extends Pair<F>{

    public TextPair(F left, F right) {
        super(left, right);
    }

    public boolean sameLength(){
        return getLeft().length() == getRight().length();
    }
}



class UsePair {
    public static void main(String[] args) {
        Pair<String> ps = new Pair<>("somethinginchinese", "notchinese");
        String cn = ps.getLeft();
        ps.setRight("Hallo");
        Pair<LocalDate> pld = new Pair<>(LocalDate.now(), LocalDate.now());
    }
}
