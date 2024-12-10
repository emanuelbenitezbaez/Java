import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        var aleatorio = random.nextInt(1,100);
        System.out.println("Numero: " + aleatorio);
    }
}