package casts;

class P {
    void doOne() {
    }

    void doTwo() {
    }
}

class C extends P {

    void doTwo() {
    }

    void doThree() {
    }
}

public class TryCasts {

    public static void main(String[] args) {
        CharSequence cs = "";
        CharSequence[] csa = {cs};
        String s1 = (String) cs + 3;
        System.out.println(s1);
        String s2 = (String) csa[0] + 3;
        System.out.println(s2);
        int l1 = ((String) cs).length();
        System.out.println(l1);

        P p = null;
        p.doOne();
        p.doTwo();
        /*p.doThree(); p is not an instance of C
        (C)p.doTwo(); it calls de method first returning a void, and you cant cast a void*/
        ((C)p).doTwo();
        ((C)p).doThree();
    }
}
