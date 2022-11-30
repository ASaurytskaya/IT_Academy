package additional.flowers;

public class Roses implements IFlowers{
    private int expiryPeriod = 7;


    @Override
    public int getExpiredPeriod() {
        return expiryPeriod;
    }
}
