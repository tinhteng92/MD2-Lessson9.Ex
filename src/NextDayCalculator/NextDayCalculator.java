import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NextDayCalculator {
    public static String addDays(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(date));
        c.add(Calendar.DATE, 1);
        date = sdf.format(c.getTime());
        return date;
    }
}
