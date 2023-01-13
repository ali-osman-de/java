import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = s.nextInt();

        if(age >= 0 && age <= 9){
            System.out.println("Kid");
        }else if (age >= 10 && age <= 19){
            System.out.println("Teenager");
        }else if (age >= 20 && age <= 49){
            System.out.println("Adult");
        }else if (age >= 50 && age <= 100){
            System.out.println("Old");
        }else {
            System.out.println("Uncategorized");
        }
    }
}