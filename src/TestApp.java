public class TestApp {
    public static void main(String[] args) {
        Tire tire = new Tire(123,"SuperTire","ProContact","Winter Pro",17,225);
        tire.printInfo();
        ExhaustPart exhaustPart = new ExhaustPart(987,"Noisy Parts","turbo brum","noisy exhaust", true );
        exhaustPart.printInfo();
    }
}