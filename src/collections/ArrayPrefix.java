package collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Set;

public class ArrayPrefix {

    /* Arrays of Generics cant be created.
    public static <E> E[] make(E e){
        E[] rv = {e};
        return rv;
    }*/

    public static void main(String[] args) {
        int[] ia = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(ia));
        Arrays.parallelPrefix(ia, (a, b) -> a + b);
        System.out.println(Arrays.toString(ia));

        String[] names = {"Alice", "Bob", "Charlie", "Denice", "Frank",
                "Eve", "Grace", "Heidi", "Ivan"};
        System.out.println(Arrays.binarySearch(names, "Eve"));
        System.out.println(Arrays.binarySearch(names, "Claudia"));

        Deque<Integer> di = new ArrayDeque<>();
        di.addFirst(1);
        di.addFirst(2);
        di.addLast(3);
        System.out.println(di.removeFirst() + ", ");
        System.out.println(di.removeLast() + ", ");
        System.out.println(di.getLast() + ", ");
        System.out.println(di.removeFirst() + ", ");
//        System.out.println(di.removeLast() + ", "); Throws an exception
        System.out.println(di.peekLast() + ", ");

        var sa = new String[]{"One", "Two", "Three"};
//        This is a reflexion of object 'sa' not a copy
        var ls = Arrays.asList(sa);
        var ss = Set.of("Uno", "Dos", "Tres");
        sa[0] = "Zero";
        int i = 0;
        for (String s : ss) {
            System.out.printf("%7s : %7s\n", ls.get(i++), s);
        }
    }
}
