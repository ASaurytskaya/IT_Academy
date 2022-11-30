package additional.flowers;

public class Gerbera implements IFlowers{
    private int expiryPeriod = 5;

    @Override
    public int getExpiredPeriod() {
        return expiryPeriod;
    }
}
