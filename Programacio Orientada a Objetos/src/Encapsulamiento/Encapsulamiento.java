package Encapsulamiento;

public class Encapsulamiento {

    //Ateributos

    String name;

    //Constructor


    public Encapsulamiento(String name) {
        this.name = name;
    }

    //Metodos
    public void showData (){
        System.out.println("Nombre: " + name);
    }
}
