package demo;

/**
 * @author 邹璇霖
 */

public abstract class AbstractClock {
    protected int utcOffset;

    public AbstractClock(final int utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     *  get the clock's time
     * @return the clock's time
     */
    public abstract int getTime();
}
