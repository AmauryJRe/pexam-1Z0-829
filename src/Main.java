public class Main {
    public static void main(String[] args) {

        // % and module are not the same, % is remainder,
        // this takes the sign from the left and ignores the sign on the right
        int y = -2%-3;

        // Any random number generated with Math.random, minus a number can lead to negative results
        // since random generated numbers can result in 0 or smaller positive number that the one substracted
        int x=(int)(Math.random()*6)-3;
        System.out.println(y);
    }
}