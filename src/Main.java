import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Instant i1 = Instant.now();
        System.out.println(i1);

        ZonedDateTime z1 = ZonedDateTime.ofInstant(i1, ZoneId.of("America/New_York"));
        System.out.println(z1);

        Duration d1 = Duration.ofMinutes(3080);
        System.out.println(d1);

        //The duration or length of a Period is printed in the format PT|Year|Y||Moths|M|Days|D (P1Y14M540D)
        // Using the method "normalized()" it preforms an automatic conversion from months to years but ignoring the days since
        // it does not know the starting point and therefor being unable to tell whether it is a
        // leap year or how many days has the current mont.
        Period p1 = Period.of(1, 14, 540);
        System.out.println(p1);
        System.out.println(p1.normalized());

        LocalDate ld1 = LocalDate.of(2065, 4, 13);
        System.out.println(ld1);
        System.out.println(ld1.getMonth());
        LocalDate ld2 = ld1.plusDays(10);
        System.out.println(ld2);
        System.out.println(ld1.with(ChronoField.MONTH_OF_YEAR, 6));

        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld3 = LocalDate.from(ldt);
        System.out.println(ldt);
        System.out.println(ld3.isSupported(ChronoField.YEAR));
        System.out.println(ld3.isSupported(ChronoField.HOUR_OF_DAY));
        var ltd1 = ld1.atTime(13, 05);
        System.out.println(ltd1);
        System.out.println(ltd1.getClass().getName());

        var ld4 = LocalDate.of(2100, 1, 1);
        var res = ld4.adjustInto(ld3);
        System.out.println(res);
        System.out.println(res.getClass().getName());

        System.out.println(ld4.isLeapYear());

        Period thirty = Period.ofDays(30);
        Period oneMonth = Period.ofMonths(1);
        LocalDate ld5 = LocalDate.of(2024, 2, 14);
        System.out.println(ld5);
        System.out.println(ld5.plus(oneMonth));

        ZoneId.getAvailableZoneIds().forEach(System.out::println);

//        ZoneId.of("Europe/Berlin")
//                .getRules().getTransitions()
//                .forEach(System.out::println);
        System.out.println(ZoneId.of("America/New_York").getRules().nextTransition(Instant.now()));
        System.out.println(ZoneId.of("America/New_York").getRules().previousTransition(Instant.now()));

        System.out.println("-----------");

        var shiftTime = ZonedDateTime.parse("2024-11-01T02:00-04:00[America/New_York]");

        System.out.println(shiftTime);
        System.out.println(shiftTime.plusHours(24));
        System.out.println(shiftTime.plusHours(48));
        System.out.println(shiftTime.plusHours(72));
        System.out.println("-----------");
        System.out.println(shiftTime.plusDays(1));
        System.out.println(shiftTime.plusDays(2));
        System.out.println(shiftTime.plusDays(3));


        System.out.println("Flight schedule");

        var takeoff = ZonedDateTime.of(
                2024, 7, 14, 12, 0, 0, 0, ZoneId.of("America/Denver"));
        var landing = takeoff.plusHours(12).plusMinutes(51);
        System.out.println(landing.withZoneSameInstant(ZoneId.of("Europe/Athens")));

        System.out.println("-------");

        var ins1 = Instant.now();
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        var ins2 = Instant.now();
        System.out.println(
                ins1.truncatedTo(ChronoUnit.MINUTES).compareTo(ins2.truncatedTo(ChronoUnit.MINUTES))
        );

    }
}