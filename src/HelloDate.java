import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * Created by danawacomputer on 2017-04-20.
 */
public class HelloDate {

    public static void main(String[] args) {

        long current = System.currentTimeMillis();

        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.now();

        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
        System.out.println(zdt);

        System.out.println(current);
    }


}
