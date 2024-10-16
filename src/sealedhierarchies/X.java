package sealedhierarchies;

abstract class Y {
    int x = 100;

    Y(int v) {
        /*Third step - here it is called the default constructor "super()" and all initializations on this class, at this point x on this instance has value 100 */
        x = v;
        /*At this point x on this instance has the value of v being 200*/
        announce(/*Here we call this abstract method, but since it has a valid implementation that implementation will be executed*/);
    }

    abstract void announce();
}

public class X extends Y {
    int x = 300;

    X() {
        super(200);/*Second step - This executes immediately calling the constructor on the parent class, at this point "instance x" has not being initialized therefore its value is 0 by default*/
        /*Fifth step - now all instances initializations occur, setting x value to 300, but at this point announce method has already been called printing x = 0*/
    }

    void announce() {
        /*Forth step - the call to this method will print the x being this x part of the X instance and not Y instance,
         it will have the value provided in the current instance of X
         taking in consideration that this instance has not being initialized,
         because we are in the middle of initializing the parent class Y,
         all values are by default leaving x with value 0 at this point */
        System.out.println("X is " + x);
        /*At this point the call is ended, and we return to the X instance constructor*/
    }

    public static void main(String[] args) {
        new X();/*First step - Starting here firsts it is called the constructor on the class X*/
    }
}
