package staticinitializations;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryIt {

/*
    This fails due to a checked exception threw by FileReader
    static BufferedReader fr = new BufferedReader(new FileReader("config.data"));

    static {
        confText=fr.readLine();
    }
    static String confText;
*/


/*
    Fails because text is unqualified on the print, to refer to a static variable before it is declared it is needed to qualify it
    static int x;
    static {
        System.out.println(x);
        System.out.println(text);
    }
    static String text;

*/

    public static void main(String[] args) {
        System.out.println(STR."\{x}, \{y}, \{z}");
    }

    static int x;

    static {
        System.out.println(STR."\{x}, \{TryIt.y}");
    }

    static int y = 100;

    static {
        System.out.println(STR."\{x}, \{TryIt.y}");
    }

    static {
        x = y + 10;
    }

    static int z = -1;
}
