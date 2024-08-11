import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // % and module are not the same, % is remainder,
        // this takes the sign from the left and ignores the sign on the right
        int y = -2 % -3;

        // Any random number generated with Math.random, minus a number can lead to negative results
        // since random generated numbers can result in 0 or smaller positive number that the one subtracted
        int x = (int) (Math.random() * 6) - 3;

        references();

    }

    // larger type values can be assigned to shorter types values if it fits and, it is not larger than "int"
    static void Promotion() {
        final int vx = 99;
        byte b = vx;
    }

    //Java automatically Wraps primitive values
    public static Object boxingConcept() {
        return true ? Double.valueOf(3.1) : Integer.valueOf(3);
    }

    //Downsizing is only made with int types, Downsizing is choosing the smallest type that can hold reliable all values.
    public static Object downsizing() {
        final short s = 10;
        byte b = 127;
        return true ? b : s;
    }

    //Double and Float can parse the strings "Infinity,+Infinity and  -Infinity" But not other strings
    private static void parseDoubleInfinity() {
        double pinfinity = Double.parseDouble("1e309"); // This will be Infinity
        double ninfinity = Double.parseDouble("-1e309"); // This will be Infinity
        if (pinfinity == Double.POSITIVE_INFINITY) {
            System.out.println("Positive Overflow occurred!");
        }
        if (ninfinity == Double.NEGATIVE_INFINITY) {
            System.out.println("Negative Overflow occurred!");
        }
    }

    static void references() {
        var l1 = new ArrayList<>();
        l1.add("Hello");
        var l2 = new ArrayList<>(l1);
        l1.add("Bonjour");
        System.out.println(l2);
        l2 = l1;
        l1.add("nihao");
        System.out.println(l2);

        String g1 = "Hello";
        String g2 = g1;
        System.out.println(g1);
        System.out.println(g2);
        g1 = g1.concat(" World!");
        System.out.println(g1);
        System.out.println(g2);

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1;
        System.out.println(sb1);
        System.out.println(sb2);
        sb1.append(" World!");
        System.out.println(sb1);
        System.out.println(sb2);
    }

    static void expressionSideEffect() {
        int i = 0;
        int[] ia = new int[]{0, 1, 2, 3};
        int[] ee1 = Arrays.copyOf(ia, ia.length);
        int[] ee2 = Arrays.copyOf(ia, ia.length);
        //Here we have a pre increment of 'i' leading it to the value of 1 being it is initial value 0
        //then there is a second pre increment setting the value if 'i' in 2
        //lastly there is a plain evaluation of 'i' being its value still 2
        //leading to a result of ee1[1]=ee1[2]+ee[2]
        ee1[++i] = ee1[++i] + ee1[i];
        i=0;
        //in this case there is an assignment operator which provokes a side effect
        // meaning that the expression ee2[++i] is evaluated only once leading to the result ee2[1]+=ee2[1]
        ee2[++i]+=ee2[i];
        System.out.println(Arrays.toString(ia));
        System.out.println(Arrays.toString(ee1));
        System.out.println(Arrays.toString(ee2));
    }
}