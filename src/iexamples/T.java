package iexamples;

public interface T {

    void doSomething();

    void doSomethingElse();
}

interface U extends T {
    default void doSomething() {
    }
}

interface V extends U {
    void doSomething();
}

class A implements T {
    @Override
    public void doSomething() {

    }

    @Override
    public void doSomethingElse() {

    }
}

abstract class B implements T {
}

class C implements V {
    public void doSomethingElse() {
    }

    @Override
    public void doSomething() {

    }
}

class D implements U {
    public void doSomethingElse() {

    }
}
