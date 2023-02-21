package javacore.lesson.loops;

public class WhileDoWhile {

    public static class Test1 {
        public static void main(String[] args) {
            int i = 1;

            while (i <= 10) {
                System.out.println(i);
                i++;
            }
            System.out.println(i);
        }
    }

    public static class Test2 {
        public static void main(String[] args) {
            int money = 100;

            while (money > 0) {
                System.out.println("Choose products");
                System.out.println("Pay for products");
                money = money - 10;
                System.out.println(money);
            }
            System.out.println(money);
        }
    }

    public static class Test3 {
        public static void main(String[] args) {
            boolean b = true;
            int a = 1;

            while (b) {
                System.out.println(a);
                if (a % 3 == 0 && a % 7 == 0) {
                    b = false;
                }
                a++;
            }
        }
    }

    public static class Test4 {
        public static void main(String[] args) {
            int a = 5; // 6,7,8,9,10,11,12

            while (a++ < 10) {
                a++;
            }
            System.out.println(a);
        }
    }

    public static class Test5 {
        public static void main(String[] args) {
            int i = 1;

            do {
                System.out.println(i);
                i++;
                System.out.println(i);
            }
            while (i == 10);
        }
    }

    public static class Test6 {
        public static void main(String[] args) {
            int money = 0;

            do {
                System.out.println("Choose products");
                System.out.println("Pay for products");
                money -= 10;
                System.out.println(money);
            }
            while (money > 50);
        }
    }

    public static class Test7 {
        public static void main(String[] args) {
            int hour = 0;

            OUTER:
            do {
                int min = 0;

                INNER:
                while (min < 60) {
                    System.out.println(hour + ":" + min);
                    min++;
                }
                hour++;
            }
            while (hour < 24);
        }
    }

    public static class Test8 {
        public static void main(String[] args) {
            OUTER:
            for (int hour = 0; hour < 24; hour++) {
                int min = 0;

                INNER:
                while (min < 60) {
                    System.out.println(hour + ":" + min);
                    min++;
                }
            }
        }
    }
}