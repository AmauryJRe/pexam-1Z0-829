public class Main {
    public static void main(String[] args) {
        System.out.println('\u7231');
        String s1 = "Hello";
        String s2 = """
                Hello""";
        // String s3 = """Hello""";
        String s4 = """
                Hello
                """;
        String s5 = """
                             Hello
                """;
        String s6 = """
                Hello\r\n""";
        String s7 = """
                "\"""";
        System.out.println(s7);
        System.out.println('\u7231');

        int i = 0;
        String s = "VAlues: ";
        loop:
        while (i < 5) {
            if (i++ % 2 == 0) continue;
            System.out.println("Continued loop: " + i);
            s.concat(", ").concat(Integer.toString(i));
        }
        System.out.println(s);

    }

}