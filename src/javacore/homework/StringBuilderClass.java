package javacore.homework;

public class StringBuilderClass {

    public static boolean checkEquals(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("Hello");
        StringBuilder sb4 = new StringBuilder("Hello");
        StringBuilder sb5 = new StringBuilder("hello");

        System.out.println(checkEquals(sb3, sb4));
        System.out.println(checkEquals(sb4, sb5));
        System.out.println(checkEquals(new StringBuilder(""), new StringBuilder("")));
        System.out.println(checkEquals(new StringBuilder(), new StringBuilder()));
    }
}
