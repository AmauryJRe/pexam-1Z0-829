package records;
record Customer(String name, int creditLimit){}
public class Example {

    public static void main(String[] args) {
        Customer c1 = new Customer("Fred",1000);
        System.out.println(c1);
        System.out.println(STR."customer \{c1.name()} has credit limit \{c1.creditLimit()}");
        Customer c2 = new Customer("Fred",1000);
        Customer c3 = new Customer("Freddy",1000);
        System.out.println(STR."c1.equalz(c2)? \{c1.equals(c2)}");
        System.out.println(STR."c1.equalz(c3)? \{c1.equals(c3)}");



        System.out.println(STR."c1.hashCode()? \{c1.hashCode()}");
        System.out.println(STR."c2.hashCode()? \{c2.hashCode()}");
        System.out.println(STR."c3.hashCode()? \{c3.hashCode()}");


    }
}
