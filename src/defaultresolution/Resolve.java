package defaultresolution;

interface W {


//    We can not override a member of java lang Object
//   default boolean equals(Object o) {return true;}

    default void doStuff() {
        System.out.println("default W.doStuff");
    }
}

class B  extends  A{
    public void doStuff() {
        System.out.println("B.doStuff");
    }
}

class A implements W {

    public void doStuff() {
        System.out.println("A.doStuff");
//        W.super.doStuff();
    }
}


public class Resolve {
    public static void main(String[] args) {
        new A().doStuff();
    }
}
