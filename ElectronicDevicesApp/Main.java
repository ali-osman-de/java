// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Apple", "MacBook Pro", "macOS", 16000);
        Phone myPhone = new Phone("Xiaomi", "Poco X3 Pro", "555-1234",15000);
        System.out.println(myComputer.brand + " cihaz açıldı.");
        System.out.println(myPhone.brand + " cihaz açıldı.");
        System.out.println("Başlangıçta tanımlanan cihazlar tanımlanan nesneler üzerinde erişiliyor:");
        System.out.println(myComputer.brand + " marka " +  myComputer.price + " fiyatında, " + myComputer.os + " işletim sistemine sahip bilgisayar.");
        System.out.println(myPhone.brand + " marka " +  myPhone.price + " fiyatında, " + myPhone.phoneNumber + " telefon numarasına sahip telefon.");
        System.out.println("Sistem güncelleniyor...");
        myComputer.updateOperatingSystem("Windows 11");
        myPhone.call("545-2562483");
        myComputer.close();
        myPhone.close();

    }
}