package Excepciones;

public class Excepciones {




    public static void main(String[] args) {

        int[] edades ={12,23,45,56};



        //Intenta ejecutar el codigo o la logica
        try {
            System.out.println("Edad" + edades[4]);
        //Si encuentro una excepcion lo cacheo
        } catch ( Exception  ex) {
            System.out.println("Intente acceder a un indice que no tengo.");

            //Pase lo que pase ejecuta la logica en el finally
        }finally {
            System.out.println("pase lo que pase ejecuto la logica..");
        }

    }
}
