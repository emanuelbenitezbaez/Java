package metodosestaticos;


public class Main {
    public static void main(String[] args) {


        Persona persona1 = new Persona("Emanuel","Benitez");
        Persona persona2 = new Persona("Paula","Federico");
        Persona persona3 = new Persona("Nombre","Apellido");

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);


        System.out.println("\nCantidad total de objetos persona creados: " + Persona.getNumeroPersonas());



        //El metodo estatico es igual a atributos estaticos pero accedemos a atributos privados estaticos atraves de metodos estaticos.

        // Creamos el metodo que necesitemos eje: public static int getNumeroPersonas()

        // Y accedemos al atributo desde el Main mediante la clase padre ej: Persona.getNumeroPersonas()

    }
}
