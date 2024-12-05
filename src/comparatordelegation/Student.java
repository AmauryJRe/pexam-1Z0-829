package comparatordelegation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int percentage;

    public Student(String name, int percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}

class Ordering {
    public static void main(String[] args) {
        List<Student> roster = new ArrayList<>(List.of(
                /*new Student(null, 68),
                new Student(null, 69),*/
                new Student("Fred", 68),
                new Student("Jim", 52),
                new Student("Sheila", 93),
                new Student("Bill", 66),
                new Student("Andy", 73),
                new Student("Fred", 83),
                new Student("Mary", 83)
        ));
        System.out.println("Original Order");
        roster.forEach(System.out::println);
        System.out.println("Grade Order");
        roster.sort(Comparator.comparingInt(Student::getPercentage));
        roster.forEach(System.out::println);
        System.out.println("Name, then grade descending, order");
        roster.sort(
                Comparator.comparing(Student::getName)
                        .thenComparing(Student::getPercentage, Comparator.reverseOrder()));
        roster.forEach(System.out::println);

    }
}
