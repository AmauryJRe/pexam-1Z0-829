package lambdapredicates;

import javax.swing.*;
import java.awt.*;
import java.util.function.Predicate;

public class TryLambda {
    public static void main(String[] args) {
        Predicate<String> longString = s -> s.length() > 3;

        System.out.println(longString.test("Hello"));

        int [] count ={0};
        JFrame f=new JFrame("Button Example");
        JButton jb = new JButton("Press Me");
        jb.setBounds(0,0,95,30);
        jb.addActionListener(e -> System.out.println("CLick " + count[0]++ + " times"));
        f.add(jb);
        Dimension d = new Dimension();
        d.setSize(100,100);
        f.setSize(d);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
