package additional.flowers;

public class BouquetMain {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.createBouquet(3, 3, 3);
        int date1 = 3;
        int date2 = 9;
        System.out.println(bouquet.hasExpiredFlowers(date1));
        System.out.println(bouquet.hasExpiredFlowers(date2));
    }
}
