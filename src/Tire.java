class Tire extends Part {
    private int size;
    private int width;

    public Tire(int serialNumber, String producer, String model, String series, int size, int width) {
        super(serialNumber, producer, model, series);
        this.size = size;
        this.width = width;
    }

    public Tire(int size, int width) {
        this.size = size;
        this.width = width;
    }

    void printInfo(){
     System.out.println("Serial Number: "+ getSerialNumber()+", producer: "+getProducer()+", model: "+getModel()+", series: "+ getSeries()+
             ", size: "+size+", width: "+width);
 }
}