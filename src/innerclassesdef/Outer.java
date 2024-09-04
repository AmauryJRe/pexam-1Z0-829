package innerclassesdef;

public class Outer {
    private String name = "An Outher";

    public class Inner {
        private String name = "An Inner";

        public void show() {
            System.out.println(name);
        }
    }

//    public static void main(String[] args) {
//        Inner inner = new Outer().new Inner();
//        inner.show();
//    }
}
