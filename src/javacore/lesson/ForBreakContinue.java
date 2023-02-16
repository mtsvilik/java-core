package javacore.lesson;

public class ForBreakContinue {

    static class Test1 {
        public static void main(String[] args) {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Lesson 14");
            }
        }
    }

    static class Test2 {
        public static void main(String[] args) {

            for (int i = 2; i <= 11; i++, abc(10)) {
                System.out.println(i);
            }
        }

        static void abc(int n) {
            System.out.println(n);
        }
    }

    static class Test3 {
        public static void main(String[] args) {
            for (int i = 2; i <= 30; i = i + 2) {
                System.out.println(i);
            }
        }
    }

    static class Test4 {
        public static void main(String[] args) {
            int a = 15;
            if (a > 10) {
                System.out.println(a);
                a = a + 10;
                System.out.println(a);
            }
        }
    }

    static class Test5 {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (i == 7) {
                    break;
                }
                System.out.println(i);
            }
        }
    }

    static class Test6 {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (i == 87) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

    static class Test7 {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                if (i == 10) {
                    continue;
                }
                if (i % 55 == 0) {
                    break;
                }
                System.out.println(i);
            }
        }
    }

    static class Test8 {
        public static void main(String[] args) {
            Test8 time = new Test8();
            time.printTime();
        }

        public void printTime() {
            OUTER:
            for (int hour = 0; hour <= 23; hour++) {
                System.out.println("Start outer loop");
                INNER:
                for (int min = 0; min <= 59; min++) {
                    System.out.println(hour + ":" + min);
                    if (min == 30) {
                        break OUTER;
                    }
                }
                System.out.println("Finish outer loop");
            }
        }
    }
}
