public class Constructor {
    //Un método constructor es una función especial dentro de una clase en programación orientada a objetos.
    //Su propósito principal es inicializar los objetos que se crean a partir de esa clase.
    //Es el primer método que se ejecuta automáticamente cuando se instancia un objeto de la clase.

    String nombre;
    int edad;

    //Constructor
   public Constructor(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
  public void  Show (){
      System.out.println("Nombre: " + nombre);
      System.out.println("Edad: " + edad);
  }

}
