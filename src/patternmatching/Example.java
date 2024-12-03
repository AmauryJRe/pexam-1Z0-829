package patternmatching;

public class Example {
    public static void main(String[] args) {
        Object thing = "Hello";
        if (thing instanceof String) {
            String stringThing = (String) thing;
            if (stringThing.length() > 4) {
                System.out.println("Long string");
            }
        }

        if (thing instanceof String stringThing) {
//            String stringThing = (String) thing;
            if (stringThing.length() > 4) {
                System.out.println("Long string");
            }
        }

        if (thing instanceof String stringThing && stringThing.length() > 4) {
                System.out.println("Long string");
        }

    }
}
