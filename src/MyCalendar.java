import java.util.Calendar;

/**
 * Created by abarajas on 8/3/17.
 */
public class MyCalendar implements TryStuff {
    @Override
    public void tryMethod() {
        Calendar now = Calendar.getInstance();

        // Today is Jul 31th

        now.set(Calendar.MONTH, Calendar.FEBRUARY);
        now.set(Calendar.DATE, 30);

        System.out.println(now.getTime());
    }
}
