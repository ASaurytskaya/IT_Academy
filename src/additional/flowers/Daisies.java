package additional.flowers;

public class Daisies implements IFlowers {
    private int expiryPeriod = 10;


    @Override
    public int getExpiredPeriod() {
        return expiryPeriod;
    }
}
