package generics;

import java.time.temporal.TemporalAdjuster;

public class OrderPair<E extends Comparable<E>> {

    private E left;
    private E right;

    public OrderPair(E left, E right) {
        this.left = left;
        this.right = right;
    }

    public void order(){
        if(left.compareTo(right)>0){
            E temp = left;
            left = right;
            right =temp;
        }
    }

    public static void main(String[] args) {
        OrderPair<String> ops = new OrderPair<>("Alice","Bob");
        OrderPair<StringBuilder> opsb = new OrderPair<>(new StringBuilder("Alice"),new StringBuilder("Bob"));
//        OrderPair<TemporalAdjuster> opta;
    }
}
