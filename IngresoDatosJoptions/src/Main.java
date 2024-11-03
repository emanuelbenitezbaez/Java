import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
//Libreria o biblioteca de java que se usa para mostrar ventanas emergentes o pedir datos.

        //El primer parametro representa a lo que esta enlazado en jop(null = toda la dimension de mi pantalla)
       // JOptionPane.showMessageDialog(null,"Error al ingresar usuario!","error:",JOptionPane.ERROR_MESSAGE);

        JOptionPane.showMessageDialog(null,"Ingreso de datos: ");

        String edad = JOptionPane.showInputDialog(null,"Ingre su edad: ","Entrada",JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Dato ingresado: " + edad);
    }
}