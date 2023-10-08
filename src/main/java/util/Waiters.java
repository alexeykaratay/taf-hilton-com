package util;

public class Waiters {
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            System.out.println("Interrupted Exception!!!");
        }
    }

    public static void waitFor(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e){
            System.out.println("Interrupted Exception!!!");
        }
    }
}
