import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //loop to 2 billion then from -2 billion and stop
//        int x = 0;
//        do {
//            System.out.println(x);
//            x++;
//        } while (x != 0);
//        System.out.println("done");

//        Map<String,String> names = Map.of("Fred","Jones","Sheila","Smith");
//
//        for (String f : names.values()){
//            System.out.println(f);
//        }

        outer:
        for (int i = 0; i < 4; i++) {
            inner:
            for (int j = 0; j < 4; j++) {
                if (i == j)
                    break inner; /* same as continue outer as long as there is are statements after the inner block */
                System.out.println(i + ", " + j + " - ");
            }
            System.out.println("It will show up in break inner or break but not in continue outer");
        }


        superblock:
        {
            int x = 0;
            outer:
            while (x < 5) {
                System.out.println(x);
                inner:
                switch (x) {
                    case 0:
                        x = 1;
                        break inner;
                    case 1:
                        x = 3;//no break will provoke a fall through to the next case with a break or yield statement
                    case 2:
                        x = 4;
                        break;
                    case 3:
                        continue outer;
                    case 4:
                        x = 5;
                        break outer;
                }
                System.out.println("X");
            }
        }
    }
}