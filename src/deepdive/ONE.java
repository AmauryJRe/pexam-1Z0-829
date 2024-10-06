package deepdive;

public class ONE {
    static int x;
    int y;
    {x++;y++;}
    static {x++;}
    ONE(){this(++x);}
    ONE(int x){
        System.out.println(x+", "+y);
    }
    static {new ONE();}

    public static void main(String[] args) {

    }
}
