package test;

import demo.CityClock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author 邹璇霖
 */
public class CityClockTest {
    private CityClock cityClock;

    @Before
    public void initialize() {
        cityClock = new CityClock(5);
    }

    public void the_time_of_utc_zero_should_be_8_after_set_8() {
        cityClock.setUtcZeroTime(8);

        assertEquals(8, cityClock.getUtcZeroTime());
    }

    public void the_time_should_be_8_after_set_utc_time_3() {
        cityClock.setUtcZeroTime(3);

        assertEquals(8, cityClock.getTime());
    }

}
