package comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrdering {
    public static <E> Comparator<E> backwardsComparator(Comparator<E> forwards) {
        return (a, b) -> forwards.compare(b, a);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Fred", "Jim", "Sheila", "Alice", "Bob", "Scott", "Maverick"));
        System.out.println(names);
        /*Comapare and sort by natural order*/
        names.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(names);
        /*Delegate to a method Compare.*/
        names.sort(backwardsComparator(String.CASE_INSENSITIVE_ORDER));
        System.out.println(names);


       /* var la= Arrays.asList(1,2,3);
        var lb = List.copyOf(la);
        la.set(1,44);
        System.out.println(la);
        System.out.println(lb);
        System.out.println(la==lb);*/
    }
}
