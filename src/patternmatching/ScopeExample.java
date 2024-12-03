package patternmatching;

public class ScopeExample {
    public static void main(String[] args) {
        Object object = "";

        if (object instanceof String s) {
            System.out.println("In scope: " + s);
        } else {
            System.out.println("Not in scope");
        }

        if (object instanceof String s && s.length() > 5) {
            System.out.println("long string " + s);
        } else {
            System.out.println("Not long or not string"/* s has being not initialized here*/);
        }

        //Cant use || here
        /*if (object instanceof String s || s.length() > 5) {
            System.out.println("long string " + s);
        } else {
            System.out.println("Not long or not string"*//* s has being not initialized here*//*);
        }*/

        if (!(object instanceof String s) || s.length() > 5) {
            System.out.println("long string " /* + s // not available here*/);
        } else {
            System.out.println("Not long or not string" + s);
        }
        object = "ala";
        if (!(object instanceof String str)) throw new IllegalArgumentException();
        System.out.println(str);
    }
}
