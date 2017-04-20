import java.time.LocalDate;

/**
 * Created by danawacomputer on 2017-04-20.
 */
public class Anniversary {

    public static void main(String[] args) {

        LocalDate baseDate = LocalDate.of(2017,4,3);
        LocalDate fifty = baseDate.plusDays(49);
        LocalDate oneHundred = baseDate.plusDays(100);
        LocalDate twoHundred = baseDate.plusDays(200);
        LocalDate fiveHundred = baseDate.plusDays(500);
        LocalDate oneThousand = baseDate.plusDays(1000);

        if(fifty.compareTo(oneHundred) > 0) { //거짓
            System.out.println("fifty가 더 커요");
        } else {
            System.out.println("oneHundred가 더 커요");
        }

        long epochDay = baseDate.toEpochDay();
        System.out.println(epochDay);

        System.out.println(fifty);
        System.out.println(oneHundred);
        System.out.println(twoHundred);
        System.out.println(fiveHundred);
        System.out.println(oneThousand);

    }


}
