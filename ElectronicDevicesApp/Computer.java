public class Computer extends ElectronicDevice {
    String os;

    public Computer(String brand, String model, String os, double price) {
        super(brand, model, price);
        this.os = os;
    }

    public void updateOperatingSystem(String newOs) {
        System.out.println("İşletim sistemi " + newOs + " olarak güncellendi.");
        this.os = newOs;
    }


    @Override
    public void close() {

        System.out.println(brand + " cihaz kapatıldı...");
    }
}