package localclasses;


//class MyRunnable implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("Hello from MyRunnable");
//    }
//}

abstract class MyRunnable2 implements Runnable {
    String message;

    MyRunnable2(String s) {
        message = s;
    }
}

public class MyTask {
    public static void main(String[] args) {
//        Runnable r = new MyRunnable();
        MyRunnable2 r = new MyRunnable2("Aloha") {

            @Override
            public void run() {
                System.out.println("Subclass of MyRunnable, Hello from MyRunnable " + message);
            }
        };
        r.run();
    }
}
