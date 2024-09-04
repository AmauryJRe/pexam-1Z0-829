package abstracts;

//Abstract classes can not be final, since its purposes is to be subclassed
public abstract class Thing {

    public void doStuff(){
        System.out.println("Something");
    }
}
