package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TryStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of(
                "Fred",
                "Sheila",
                "Robert"
        ));

        List<String> decoupled = names.stream()
                .flatMap(n -> n.chars()
                        .mapToObj(r -> String.valueOf((char) r)))
                .toList();
        System.out.println(decoupled);

        List<Integer> numbers1 = IntStream.iterate(1, v -> v < 1000, v -> v + 2).boxed().toList();
        List<Integer> numbers2 = IntStream.iterate(1, v -> v + 2).limit(500).boxed().toList();
        List<Integer> numbers3 = IntStream.rangeClosed(1, 999).filter(v -> v % 2 != 0).boxed().toList();
        List<Integer> numbers4 = IntStream.range(1, 1000).filter(v -> v % 2 != 0).boxed().toList();
        List<Integer> numbers5 = IntStream.range(0, 500).map(v -> v * 2 + 1).boxed().toList();

//        numbers5.forEach(System.out::println);


        Spliterator.OfInt sp1 = IntStream.range(0, 100).spliterator();
//        sp1.tryAdvance((int x) -> System.out.println("sp1 before: "+x));
        var sp2 = sp1.trySplit();
//        sp1.tryAdvance((int x) -> System.out.println("sp1: "+x));
//        sp2.tryAdvance((int x) -> System.out.println("sp2: "+x));

        var sp3 = sp1.trySplit();
        var sp4 = sp2.trySplit();
        var sp5 = sp1.trySplit();
        var sp6 = sp2.trySplit();
        var sp7 = sp3.trySplit();
        var sp8 = sp4.trySplit();


        /*
         *  Format of splitting
         *  Spliterator.OfInt sp1 = IntStream.range(0,100).spliterator()
         *  sp1 holds all range
         *  result of splitting sp1, split range holds second half and assigns firs half to the new object
         *            SP1
         *        SP2     SP1
         *    SP4     SP2     SP3     SP1
         *  SP8 SP4 SP6 SP2 SP7 SP3 SP5 SP1
         * */


//        sp8.forEachRemaining((int r)-> System.out.println("tr1: "+r));
//        sp4.forEachRemaining((int r)-> System.out.println("tr1: "+r));
//        sp6.forEachRemaining((int r)-> System.out.println("tr1: "+r));
//        sp2.forEachRemaining((int r)-> System.out.println("tr1: "+r));
//        sp7.forEachRemaining((int r)-> System.out.println("tr1: "+r));
//        sp3.forEachRemaining((int r)-> System.out.println("tr1: "+r));
//        sp5.forEachRemaining((int r)-> System.out.println("tr1: "+r));
//        sp1.forEachRemaining((int r)-> System.out.println("tr1: "+r));

//        sp1.tryAdvance((int x) -> System.out.println("sp1: "+x));
//        System.out.println(sp1.estimateSize());

//        Manual Threads
        
//        Thread tr1 = new Thread(()->sp1.forEachRemaining((int r)-> System.out.println("tr1: "+r)));
//        Thread tr2 = new Thread(()->sp2.forEachRemaining((int r)-> System.out.println("tr2: "+r)));
//        Thread tr3 = new Thread(()->sp3.forEachRemaining((int r)-> System.out.println("tr3: "+r)));
//        Thread tr4 = new Thread(()->sp4.forEachRemaining((int r)-> System.out.println("tr4: "+r)));
//        Thread tr5 = new Thread(()->sp5.forEachRemaining((int r)-> System.out.println("tr5: "+r)));
//        Thread tr6 = new Thread(()->sp6.forEachRemaining((int r)-> System.out.println("tr6: "+r)));
//        Thread tr7 = new Thread(()->sp7.forEachRemaining((int r)-> System.out.println("tr7: "+r)));
//        Thread tr8 = new Thread(()->sp8.forEachRemaining((int r)-> System.out.println("tr8: "+r)));
//
//        tr1.start();
//        tr2.start();
//        tr3.start();
//        tr4.start();
//        tr5.start();
//        tr6.start();
//        tr7.start();
//        tr8.start();
//
//        try {
//            tr1.join();
//            tr2.join();
//            tr3.join();
//            tr4.join();
//            tr5.join();
//            tr6.join();
//            tr7.join();
//            tr8.join();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    }
}
