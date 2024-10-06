package instanceinitializations;

public class TryIt {
    public static void main(String[] args) {
        new TryIt().go();
    }

    public void go() {
        System.out.println(STR."\{x}, \{y}, \{z}");
    }

    int x;

    {
        System.out.println(STR."\{x}, \{this.y}");
    }

    int y = 100;

    {

        System.out.println(STR."\{x}, \{this.y}");
    }

    {
        x = y + 10;
    }

    int z = -1;
}
