package defaultresolution;

interface IV{
    default void doStuff(){};
}

interface IW{
    default void doStuff(){};
}

class A2 implements IV,IW{
    @Override
    public void doStuff() {
        System.out.println("A2.doStuff");
    }
}


public class Resolve2 {
}
