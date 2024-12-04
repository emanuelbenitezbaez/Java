package Archivos;
import java.io.*;
public class Archivos {
    public static void main(String[] args) {


        //Definimos nombre del archivo
        var nombre ="Saludos";

        //Creamos un archivo de tipo FILE y le asignamos el nombre


        try {
            var archivo_texto = new File(nombre);
        } catch (Exception e) {
            System.out.println("Error al leer archivo.");
            e.printStackTrace();

        }
    }
}
