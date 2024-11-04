import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ejercicio  #3.
        Declara una variable edad y una variable permisoPadres (booleano).
        Utiliza condicionales anidados para determinar si la persona puede asistir a una excursión:

        Si la edad es menor de 12, necesita permiso de los padres.
        Si la edad es mayor o igual a 12 y menor de 18, puede asistir sin permiso.
        Si la edad es mayor o igual a 18, puede asistir independientemente del permiso.
        */


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad por favor: ");
        int edad = entrada.nextInt();

        System.out.println("Tiene permiso de sus padres? (true - false) ");
        boolean permiso_padres = entrada.nextBoolean();

        if (edad < 12 ){
            if (permiso_padres == true ){
                System.out.println("Puede asistir.");
            }else{
                System.out.println("No puede asistir, necesita permiso");
            }
        } else if (edad >=12 && edad < 18) {
            System.out.println("Puede asistir sin permiso.");
        }  else {
            System.out.println("Puede asistir independientemente del permiso.");
        }

    }
}