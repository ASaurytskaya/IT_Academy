package additional.flowers;

public class Bouquet {
    private IFlowers[] flowers;

    public void createBouquet(int numberOfDaisies, int numberOfGerbera, int numberOfRoses) {
        flowers = new IFlowers[numberOfDaisies + numberOfGerbera + numberOfRoses];
        for(int i = 0; i < flowers.length; ) {
            while (i < numberOfDaisies) {
                flowers[i] = new Daisies();
                i++;
            }
            while(i < numberOfDaisies + numberOfGerbera) {
                flowers[i] = new Gerbera();
                i++;
            }
            while(i < flowers.length) {
                flowers[i] = new Roses();
                i++;
            }
        }
    }

    public boolean hasExpiredFlowers(int daysAfterComposition) {
        boolean isExpired = false;
        for(IFlowers flower : flowers) {
            isExpired = flower.getExpiredPeriod() < daysAfterComposition;
            if(isExpired) {
                return true;
            }
        }
        return false;
    }
}