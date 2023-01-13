import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number;

        System.out.print("Sayı Giriniz: ");
        number = s.nextInt();

        if(number % 2 == 0){
            System.out.println("Girdiğiniz sayi çifttir.");
        }else {
            System.out.println("Girdiğiniz sayi tektir.");
        }
    }
}