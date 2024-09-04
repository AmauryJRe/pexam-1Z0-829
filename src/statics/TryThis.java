package statics;

public class TryThis {
    static {
        System.out.println("Hello");
    }

    {
        int cx = 99;
        System.out.println("hello");
    }

    public static class A {
    }

    class B {
    }

    static enum X {}

    static interface Y {
    }
}
