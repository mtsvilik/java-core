package javacore.lesson;

public class StringClass {

    public static class Car {
        public String color;
        private String engine;

        public Car(String color, String engine) {
            this.color = color;
            this.engine = engine;
        }

        public Car showColor(String color) {
            return new Car("red", "V8");
        }

        public static void main(String[] args) {
            Car bmv = new Car("black", "V6");
            Car mazda = bmv.showColor("yellow");
            System.out.println(bmv.color);
        }
    }

    public static class Test1 {

        public static void main(String[] args) {
            String string = new String("Hello");

            int l = string.length();
            System.out.println(l);

            char c = string.charAt(3);
            System.out.println(c);

            int i = string.indexOf("o");
            System.out.println(i);

            String string2 = string.substring(3, 5);
            System.out.println(string2);
            System.out.println(string);

            String string3 = string.trim();
            System.out.println(string3);

            String string4 = string.replace('l', 'r');
            System.out.println(string4);

            String string5 = string.replace("Hello", "Bye");
            System.out.println(string5);
            System.out.println(string);

            String string6 = "HEllO";
            System.out.println(string6.toLowerCase());
            System.out.println(string6.toUpperCase());
        }
    }

    public static class Test2 {

        public static void main(String[] args) {
            String s1 = "Once when I was six years old I saw a magnificent picture in a book, called True" +
                    "Stories from Nature, about the primeval forest. It was a picture of a boa constrictor" +
                    "in the act of swallowing an animal. Here is a copy of the drawing." +
                    "In the book it said: Boa constrictors swallow their prey whole, without chewing" +
                    "it. After that they are not able to move, and they sleep through the six months that" +
                    "they need for digestion.";

            String s2 = s1.toUpperCase();
            char c1;
            char c2;
            for (int i = 0; i < s1.length(); i++) {
                c1 = s1.charAt(i);
                c2 = s2.charAt(i);

                if (c1 != ',' && c1 != '.' && c1 != ' ' && c1 != ':' && c1 == c2) {
                    System.out.println();
                    System.out.print(c1);
                    continue;
                }
                System.out.print(c1);
            }
            System.out.println();
        }
    }

    public static class Test3 {

        public static void main(String[] args) {
            String s1 = new String("Hello world");
            String s2 = new String("Hello world");
            System.out.println(s1 == s2);
            System.out.println(s1.equals(s2));

            String s3 = "Hello world";
            String s4 = "Hello world";
            System.out.println(s3 == s4);
            System.out.println(s3.equals(s4));

            String x = "hello";
            String y = " hello".trim();
            System.out.println(x == y);
            System.out.println(x.equals(y));
        }
    }
}
