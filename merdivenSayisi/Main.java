import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int merdivenS;

        System.out.print("Merdiven Sayisi Giriniz: ");
        merdivenS = s.nextInt();


        for (int i = 1; i<= merdivenS;i++)
        {



            System.out.println("--" + i);

            for (int j = 1 ; j< i*3 ; j++ ){
                System.out.print(" ");
            }
            System.out.println("|");

            for (int j = 1 ; j< i*3 ; j++ ){
                System.out.print(" ");
            }
            System.out.println("|");

            for (int j = 0 ; j< i*3 ; j++)
                System.out.print(" ");


        }

    }
}