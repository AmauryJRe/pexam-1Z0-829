package patternmatching;

public final class TwoNums {
    private int x, y;

    public TwoNums(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object other) {
        return other instanceof TwoNums otn
                && this.x == otn.x
                && this.y == otn.y;
    }
}

class TryTwoNums {
    public static void main(String[] args) {
        TwoNums tn1 = new TwoNums(1, 2);
        TwoNums tn2 = new TwoNums(1, 2);
        TwoNums tn3 = new TwoNums(1, 3);
        System.out.println(tn1.equals(tn2));
        System.out.println(tn1.equals(tn3));
    }
}
