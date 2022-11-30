package additional.computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.setHd(new HardDrive());
        comp1.setProcessor(new Processor());
        comp1.setRam(new R_A_M());
        comp1.setVideoCard(new VideoCard());
        comp1.setPowerSupply(new PowerSupply());

        comp1.turnOn();
        comp1.turnOff();

        Computer comp2 = new Computer();
        comp2.setHd(new HardDrive());
        comp2.setProcessor(new Processor());
        comp2.setRam(new R_A_M());
        comp2.setVideoCard(new VideoCard());
        comp2.setPowerSupply(null);

        comp2.turnOn();
    }
}
