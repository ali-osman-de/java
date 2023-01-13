import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int age;
        int weight;

        System.out.println("Yaşınızı Giriniz: ");
        age = s.nextInt();

        System.out.println("Kilonuzu Giriniz: ");
        weight = s.nextInt();

        if(age>=18){
            if(weight> 50){
                System.out.println("Kan vermeye uygunsunuz.");
            }else {
                System.out.println("Kilonuz kan vermeye uygun değil.");
            }
        }else{
            System.out.println("Yaşınız kan vermeye uygun değil.");
        }
    }
}