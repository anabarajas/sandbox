import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

/**
 * Created by abarajas on 5/4/17.
 */
public class TimeZone implements TryStuff {
    @Override
    public void tryMethod() {
        String timezoneIdString = "Asia/Seoul";

        ZoneId timeZoneId = ZoneId.of(timezoneIdString);
        String displayName = timeZoneId.getDisplayName(TextStyle.SHORT, new Locale("en"));
        System.out.println(displayName);

        ZonedDateTime zoned = ZonedDateTime.now(timeZoneId);

        ZonedDateTime start = ZonedDateTime.of(zoned.getYear(), zoned.getMonthValue(), zoned.getDayOfMonth(), 0, 0, 0, 0, timeZoneId);
        ZonedDateTime end = ZonedDateTime.of(zoned.getYear(), zoned.getMonthValue(), zoned.getDayOfMonth(), 23, 59, 59, 999999999,  timeZoneId);

        Date startDate = Date.from(start.toInstant());
        Date endDate= Date.from(end.toInstant());

        System.out.println(start);
        System.out.println(end);

        System.out.println("----------");
        System.out.println(startDate);
        System.out.println(endDate);


        ZonedDateTime zdt = ZonedDateTime.now(timeZoneId);
        ZonedDateTime startOfToday = zdt.toLocalDate().atStartOfDay(timeZoneId);
        ZonedDateTime endOfToday = zdt.toLocalDate().plusDays(1).atStartOfDay(timeZoneId).minusNanos(1);

        Date startDate2 = Date.from(start.toInstant());
        Date endDate2= Date.from(end.toInstant());


        System.out.println("----------");
        System.out.println("startOfToday is: " + startOfToday);
        System.out.println("endOfToday is: " + endOfToday);

        System.out.println("----------");
        System.out.println(startDate2);
        System.out.println(endDate2);

    }
}
