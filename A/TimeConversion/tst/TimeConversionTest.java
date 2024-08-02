import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    @Test
    void hrMinToMin() {
        assertEquals(0,TimeConversion.hrMinToMin(0,0),"Test conversion from 0 hrs 0 min to 0 total minutes");
        assertEquals(1,TimeConversion.hrMinToMin(0,1), "Test conversion from 0 hrs 1 min to 1 total minutes");
        assertEquals(99,TimeConversion.hrMinToMin(0,99), "Test conversion from 0 hrs 99 min to 99 total minutes");
        assertEquals(60,TimeConversion.hrMinToMin(1,0), "Test conversion from 1 hrs 0 min to 60 total minutes");
        assertEquals(300,TimeConversion.hrMinToMin(5,0), "Test conversion from 5 hrs 0 min to 300 total minutes");
        assertEquals(150,TimeConversion.hrMinToMin(2,30), "Test conversion from 2 hrs 30 min to 150 total minutes");
    }

    @Test
    void testInvalidHours() {
        assertThrows(IllegalArgumentException.class,
                () -> TimeConversion.hrMinToMin(-1, 0)
        );
    }

    @Test
    void testHrMinToMinWithAssertAll() {
        assertAll("Test multiple calls to hrMinToMin()",
                () -> assertEquals(0,TimeConversion.hrMinToMin(0,0),"Test conversion from 0 hrs 0 min to 0 total minutes"),
                () -> assertEquals(1,TimeConversion.hrMinToMin(0,1), "Test conversion from 0 hrs 1 min to 1 total minutes"),
                () -> assertEquals(99,TimeConversion.hrMinToMin(0,99), "Test conversion from 0 hrs 99 min to 99 total minutes"),
                () -> assertEquals(60,TimeConversion.hrMinToMin(1,0), "Test conversion from 1 hrs 0 min to 60 total minutes"),
                () -> assertEquals(300,TimeConversion.hrMinToMin(5,0), "Test conversion from 5 hrs 0 min to 300 total minutes"),
                () -> assertEquals(150,TimeConversion.hrMinToMin(2,30), "Test conversion from 2 hrs 30 min to 150 total minutes")
        );
    }
}