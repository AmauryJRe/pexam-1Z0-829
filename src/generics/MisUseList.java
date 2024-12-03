package generics;

import java.util.ArrayList;
import java.util.List;

public class MisUseList {
    public static void main(String[] args) {
        List<String> names = new ArrayList(List.of("Jim"));

        names.add("Fred");
//        names.add(LocalDate.of(2024,12, 3));
        String n1 = names.get(0);
        System.out.println(n1);
//        String n2 = (String) names.get(1);
    }
}
