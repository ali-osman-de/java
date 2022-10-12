import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        Scanner s = new Scanner(System.in);

        System.out.print("1.Sayı: ");
        number1 = s.nextInt();
        //System.out.println(number1);
        System.out.println("2.Sayı: ");
        number2 = s.nextInt();
        System.out.println("3.Sayı: ");
        number3 = s.nextInt();

        if (number1 > number3 && number1 > number2){
            System.out.printf("1.Sayı en büyüktür ve değeri %d",number1);
        }else if (number2 > number1 && number2 > number3){
            System.out.printf("2.Sayi en büyüktür ve değeri %d",number2);
        }else if (number3 > number1 && number3 > number2) {
            System.out.printf("3.Sayi en büyüktür ve değeri %d",number3);
        }


    }

}