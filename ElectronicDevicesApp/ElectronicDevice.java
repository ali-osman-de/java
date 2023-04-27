public class ElectronicDevice {
    protected String brand;
    protected String model;

    protected double price;
    private boolean status;

    public ElectronicDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.status = false;
        this.price = price;
    }

    public boolean isOn() {
        return this.status;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public void open() {
        System.out.println("Elektroink cihazlar açılıyor...");
    }

    public void close() {
        System.out.println("Elektronik cihazlar kapatılıyor...");
    }
}