import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jhon,smith,federer;

        System.out.print("Enter Jhon age: ");
        jhon = s.nextInt();
        System.out.print("Enter Smith age: ");
        smith = s.nextInt();
        System.out.print("Enter Federer age: ");
        federer = s.nextInt();

        if (jhon > smith && jhon > federer){
            System.out.println("Jhon is oldest.");
        }else if (smith > jhon && smith > federer){
            System.out.println("Smith is oldest.");
        }else if (federer > smith && federer > jhon){
            System.out.println("Federer is oldest.");
        }else if (federer == smith && federer > jhon){
            System.out.println("Federer and Smith are the same and oldest.");
        }else if (jhon == smith && smith > federer){
            System.out.println("Jhon and Smith are the same and oldest.");
        }else {
            System.out.println("Unexpected Error.");
        }
    }
}