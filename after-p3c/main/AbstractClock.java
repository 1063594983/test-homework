package demo;

/**
 * @author 邹璇霖
 */

public abstract class AbstractClock {
    protected int utcOffset;

    /**
     *  get the clock's time
     * @return the clock's time
     */
    public abstract int getTime();
}
