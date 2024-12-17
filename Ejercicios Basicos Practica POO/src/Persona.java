public  class  Persona {

    //Atributos
    String nombre;
    int edad;
    String DNI;
    //Constructor

    public Persona(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }


    //Metodos

    public void mostrarInformacion() {
        System.out.println( "Nombre: " + nombre + "\nEdad: "+edad + "\nDNI: "+ DNI);
    }

}
