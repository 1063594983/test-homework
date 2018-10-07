package demo;

/**
 * @author 邹璇霖
 */
public class CityClock extends AbstractClock{
    private int utcZeroTime;

    public CityClock(final int utcOffset) {
        super(utcOffset);
    }

    @Override
    public int getTime() {
        return (super.utcOffset + this.utcZeroTime + 24) % 24;
    }

    public void setUtcZeroTime(final int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
