package subclassinitialization;

class Y {
    {
        System.out.println("Initializing Y");
    }}

public class X extends Y{
    {
        System.out.println("Initializing X");
    }

    public X(){
        System.out.println("X()");
    }
    public X(int x){
        this();
        System.out.println("X("+x+")");
    }

    public static void main(String[] args) {
        new X(1);
    }
}
