import java.time.*;

public class ClockDemo {
    public static void main(String[] args) {

        ZonedDateTime lt = ZonedDateTime.now();

        System.out.println("ZonedDateTime : " + lt);
    }
}