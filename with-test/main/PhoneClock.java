package demo;

/**
 * @author 邹璇霖
 */
public class PhoneClock extends AbstractClock {
    private HotelWorldClockSystem system;
    private int time;

    public PhoneClock(final int utcOffset) {
        super(utcOffset);
    }

    public void setTime(final int time) {
        this.time = time;
        if (this.system == null) {
            return;
        }
        for (final CityClock cityClock : this.system.getCityClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }
    }

    public void setSystem(final HotelWorldClockSystem system) {
        this.system = system;
    }

    @Override
    public int getTime() {
        return this.time;
    }
}
