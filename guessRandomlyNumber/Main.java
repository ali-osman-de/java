import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();

        int randomlyNumber,guess;
        randomlyNumber = rnd.nextInt(1,20);

        for (int i= 1; i<5; i++)
        {
            System.out.print("Sayiyi Tahmin Et: ");
            guess = s.nextInt();
            if(randomlyNumber == guess)
            {
                System.out.printf("You won! Randomly number is %d\n",guess);
                break;
            } else if (guess > randomlyNumber)
            {
                System.out.println("Too High");
            } else if (guess < randomlyNumber)
            {
                System.out.println("Too Lower");
            }else {
                System.out.printf("You lose! Randomly number is %d\n",guess);
            }
        }

    }
}