public class Main {
    public static void main(String[] args) {
        int number = 112;
        char karakter = 'A';
        System.out.println(number + " " + karakter);
        boolean T = true;
        boolean F = false;
        System.out.println(T + " "+ F);

        if(T == true){
            System.out.println("Doğru");
        }else if(T == false){
            System.out.println("Yanlış");
        }else{
            System.out.println("Yanlışlıklar oldu.");
        }
    }
}