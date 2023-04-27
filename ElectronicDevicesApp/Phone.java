public class Phone extends ElectronicDevice {
    String phoneNumber;

    public Phone(String brand, String model, String phoneNumber, double price) {
        super(brand, model, price);
        this.phoneNumber = phoneNumber;
    }

    public String call(String number) {
        System.out.println(phoneNumber + " numaralı telefon, "  + number + " numarayı arıyor...");
        return number;
    }


    @Override
    public void close() {
        System.out.println(brand + " cihaz kapatıldı...");
    }
}
