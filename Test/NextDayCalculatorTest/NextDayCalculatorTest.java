import org.junit.jupiter.api.Assertions;

import java.text.ParseException;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void addDays() throws ParseException {
       String date = "01/01/2018";
       String expected = "02/01/2018";
       String result = NextDayCalculator.addDays(date);
        Assertions.assertEquals(expected, result);

    }
}