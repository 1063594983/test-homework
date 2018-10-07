package demo;

import java.util.AbstractList;
import java.util.ArrayList;
/**
 * @author 邹璇霖
 */
public class HotelWorldClockSystem {
    private AbstractList<CityClock> cityClocks = new ArrayList<CityClock>();

    public void attach(final CityClock cityClock) {
        this.cityClocks.add(cityClock);
    }

    public AbstractList<CityClock> getCityClocks() {
        return this.cityClocks;
    }
}
