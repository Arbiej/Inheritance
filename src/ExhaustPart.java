public class ExhaustPart extends Part {

    public boolean europeanStandard;

    public ExhaustPart(int serialNumber, String producer, String model, String series, boolean europeanStandard) {
        super(serialNumber, producer, model, series);
        this.europeanStandard = europeanStandard;
    }

    void printInfo() {
        System.out.println("Serial Number: " + getSerialNumber() + ", producer: " + getProducer() + ", model: " + getModel() + ", series: " + getSeries() +
                ", is compile with european standars: " + europeanStandard);
    }
}
