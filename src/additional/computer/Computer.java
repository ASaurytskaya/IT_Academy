package additional.computer;

public class Computer {
    private HardDrive hd;
    private Processor processor;
    private R_A_M ram;
    private VideoCard videoCard;
    private PowerSupply powerSupply;

    private int countComponents = 0;
    private boolean isOn = false;


    public HardDrive getHd() {
        return hd;
    }

    public void setHd(HardDrive hd) {
        this.hd = hd;
        if(hd != null) {
            countComponents++;
        }
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
        if(processor != null) {
            countComponents++;
        }
    }

    public R_A_M getRam() {
        return ram;
    }

    public void setRam(R_A_M ram) {
        this.ram = ram;
        if(ram != null) {
            countComponents++;
        }
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
        if(videoCard != null) {
            countComponents++;
        }
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
        if(powerSupply != null) {
            countComponents++;
        }
    }

    public void turnOn() {
        if(countComponents == 5) {
            isOn = true;
            System.out.println("Computer is on.");
        } else {
            System.out.println("Some components are missing. Unable to turn on.");
        }

    }

    public void turnOff() {
        isOn = false;
        System.out.println("Computer is off.");
    }
}
