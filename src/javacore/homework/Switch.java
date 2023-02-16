package javacore.homework;

public class Switch {

    public static void checkDayQuantity(int number) {
        switch (number) {
            case 2:
                System.out.println("Quantity day of month: 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Quantity day of month: 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Quantity day of month: 31");
                break;
            default:
                System.out.println("Month doesn't exist");
                break;
        }
    }

    public static void main(String[] args) {
        checkDayQuantity(0);
        checkDayQuantity(2);
        checkDayQuantity(5);
    }
}
