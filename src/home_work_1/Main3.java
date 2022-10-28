package home_work_1;

public class Main3 {
    public static void main(String[] args) {
        double startingQuantity = Math.random()*9;
        double endingQuantity = startingQuantity + Math.random()*9;
        int time = 12;
        double growthRate = calculateGrowthRate(startingQuantity, endingQuantity, time);
        System.out.printf("Удельная скорость роста культуры %.3f ч-1.\n", growthRate);
        double gain = calculateGain(endingQuantity, growthRate, 24);
        System.out.printf("Через сутки прирост культуры составит %.2f%%.", ((gain - endingQuantity)/ endingQuantity * 100));
    }

    public static double calculateGrowthRate(double startingQuantity, double endingQuantity, int time) {
        double divisions = (Math.log10(endingQuantity) - Math.log10(startingQuantity))/Math.log10(2);
        return divisions / time;
    }

    public static double  calculateGain(double startingQuantity, double growthRate, int time) {
        return startingQuantity * Math.pow(2, growthRate * time);
    }
}
