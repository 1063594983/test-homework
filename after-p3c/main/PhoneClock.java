package demo;

/**
 * @author 邹璇霖
 */
public class PhoneClock extends AbstractClock {
    private HotelWorldClockSystem hotelWorldClockSystem;
    private int time;

    public PhoneClock(int utcOffset) {
            super.utcOffset = utcOffset;
    }

    public void setTime(int time) {
        this.time = time;
        if (this.hotelWorldClockSystem == null) {
            return;
        }
        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    @Override
    public int getTime() {
        return this.time;
    }
}
