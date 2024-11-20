import javax.swing.*;

public class Operaciones {
    //Atributos

    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos

    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
    }

    public void sumar(){
        suma = numero1 + numero2;
    }

    public void restar(){
        resta = numero1 - numero2;
    }

    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }

    public void dividir(){
        division = numero1 / numero2;
    }

    public void mostrarResultados(){
        System.out.println("El resultado de la suma es : " + suma);
        System.out.println("El resultado de la resta es : " + resta);
        System.out.println("El resultado de la multiplicacion es : " + multiplicacion);
        System.out.println("El resultado de la division es : " + division);
    }



    //Constructor


}
