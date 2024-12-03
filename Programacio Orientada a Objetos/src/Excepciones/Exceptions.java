package Excepciones;

import java.io.*;

public class Exceptions {


    public void FilesText () throws FileNotFoundException, IOException {
        File text = new File("C:\\Users\\emanu\\Desktop\\Java\\Fle.txt");
        FileReader read = new FileReader(text);
        BufferedReader buff = new BufferedReader(read);

        String texto_linea;

        while ((texto_linea = buff.readLine()) !=null){
            System.out.println("Texto linea: " + texto_linea);
        }

    }
    public void ExceptioReader () {
        //Ejecucion del metodo,codigo o funcion.
        try {
            FilesText();
        } catch (Exception e) {
            System.out.println("Error, archivo no encontrado.");
        }
    }
    public static void main(String[] args) {

        Exceptions exepts = new Exceptions();
        exepts.ExceptioReader();

    }
    }

