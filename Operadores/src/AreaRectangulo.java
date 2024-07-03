import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        System.out.println("AREA DE UN RECTANGULO");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la altura: ");
        var altura = Integer.parseInt(scanner.nextLine());

        int area = base * altura;
        System.out.println("El area del rectangulo es: " + area);

        System.out.println("PERIMETRO DEl RECTANGULO");// P= 2*(B+A) 0 (B + A) * 2
        
        int perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es : " + perimetro);
    }
}
