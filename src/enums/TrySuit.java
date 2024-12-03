package enums;


enum Suit {
    HEARTHS("coers"),DIAMONDS("carreaux"),
    CLUBS("trefles"),SPADES("piques");
    private final  String translation;
    Suit(String f){translation=f;}

    public String getTranslation() {
        return this.translation;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder(this.name().toLowerCase());
        res.setCharAt(0,Character.toUpperCase(res.charAt(0)));
        return res.toString();
    }
}

public class TrySuit {
    public static void main(String[] args) {
        System.out.println(Suit.values()[0] + " : " + Suit.values()[0].getTranslation());
    }
}
