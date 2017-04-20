import java.time.LocalDate;

/**
 * Created by danawacomputer on 2017-04-20.
 */
public class MartOffDay {

    public static void main(String[] args){
        LocalDate today = LocalDate.now();

        LocalDate nextMartOffDay = today.with(new DayMartOff());

        System.out.println(nextMartOffDay);
    }
}
