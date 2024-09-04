import innerclassesdef.MyList;
import innerclassesdef.Outer;
import privates.BuildMe;
import statics.TryThis;

import java.time.LocalDate;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        TryThis tt = new TryThis();
        var n = new TryThis.A();
        System.out.println("Hello world! " + n.getClass().getName());

        BuildMe bm = BuildMe.builder()
                .name("Fred")
                .date(LocalDate.now())
                .build();
        System.out.println(bm);

        MyList<String> mls = new MyList<>();
        MyList<String> mls2 = new MyList<>();
        mls.add("Hello");
        mls.add("Bonjour");
        mls.add("Guten tag");
        mls2.add("Monday");
        mls2.add("Lundi");
        mls2.add("montag");

        System.out.println(mls);
        System.out.println(mls2);


        Iterator<String> is1 = mls.iterator();
        Iterator<String> is2 = mls.iterator();

        Iterator<String> is3 = mls2.iterator();

        System.out.println("is1 " + is1.next());
        System.out.println("is1 " + is1.next());
        System.out.println("is3                                 " + is3.next());
        System.out.println("is2                  " + is2.next());
        System.out.println("is2                  " + is2.next());
        System.out.println("is1 " + is1.next());
        System.out.println("is3                                 " + is3.next());
        System.out.println("is2                  " + is2.next());
        System.out.println("is3                                 " + is3.next());


        System.out.println("------------");
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}