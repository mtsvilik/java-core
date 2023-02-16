package javacore.lesson;

public class StringBuilderClass {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb3.length());
        System.out.println(sb2.charAt(4));
        System.out.println(sb2.indexOf("e", 1));

        System.out.println(sb1.append(22));
        System.out.println(sb1.append(" Good day!!!!"));
        System.out.println(sb1.append(sb1));

        System.out.println(sb2.insert(5, 55));
        System.out.println(sb2.reverse());
        System.out.println(sb2.capacity());

        StringBuilder sb5 = new StringBuilder("123");
        StringBuilder sb6 = sb5.append("45");
        sb6 = sb6.append("6").append("7");
        System.out.println("sb5 = " + sb5);
        System.out.println("sb6 = " + sb6);

        StringBuilder sb7 = new StringBuilder("123");
        StringBuilder sb8 = new StringBuilder("123");
        StringBuilder sb9 = sb7;
        System.out.println(sb7 == sb8);
        System.out.println(sb7.equals(sb8));
        System.out.println(sb9.equals(sb7));

        StringBuilder sb10 = new StringBuilder("Hello");
        StringBuffer sb11 = new StringBuffer("Good bye");
        String s1 = new String(sb10);
        String s2 = new String(sb11);
        System.out.println(s1);
        System.out.println(s2);
    }
}
