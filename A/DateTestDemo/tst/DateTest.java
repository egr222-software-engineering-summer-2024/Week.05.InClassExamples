import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    public void testConstructInvalidDateInFebruaryNonLeapYear() {
        assertThrows(DateTimeException.class,
                () -> new Date(2021, 2, 29)
        );
    }

    @Test
    void test_addDays_withinTheSameMonth() {
        addHelper(2050, 2, 15, +4, 2050, 2, 19);
    }

    @Test
    void test_addDays_wrapToNextMonth() {
        addHelper(2050, 2, 15, +14, 2050, 3, 1);
    }

    @Test
    void test_addDays_multipleCalls_wrapToNextMonth() {
        Date d = addHelper(2050, 2, 15, +14, 2050, 3, 1);
        addHelper(d, +32, 2050, 4, 2);
        addHelper(d, +98, 2050, 7, 9);
    }

    private Date addHelper(int y1, int m1, int d1, int add,
                           int y2, int m2, int d2) {
        Date actual = new Date(y1, m1, d1);
        actual.addDays(add);
        Date expected = new Date(y2, m2, d2);
        assertEquals(expected, actual, "after +" + add + " days");

        return actual;
    }

    private void addHelper(Date actual, int add,
                           int y2, int m2, int d2) {
        actual.addDays(add);
        Date expected = new Date(y2, m2, d2);
        assertEquals(expected, actual, "after +" + add + " days");
    }

    @Test
    public void testRepeatNextDayOneBillionTimes() {
        assertTimeoutPreemptively(
                Duration.ofSeconds(5),
                () -> {
                    Date actual = new Date();
                    for (int i = 1; i < 1000000000; i++) {
                        actual.nextDay();
                    }
                }
        );
    }
}