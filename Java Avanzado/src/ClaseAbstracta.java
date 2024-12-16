public class ClaseAbstracta {
    public static void main(String[] args) {

      //FiguraGeometrica rectangulo = new FiguraGeometrica(); No se puede instanciar

        FiguraGeometrica rectangulo = new Rectangulo();
        rectangulo.dibujar();
        rectangulo.delinear();

        FiguraGeometrica circulo = new Circulo();
        circulo.calcularRadio();
        circulo.delinear();
        circulo.dibujar();


    }



}

//Clase abstracta : No se puede instanciar (crear objetos)
//Para crear objetos lo haces desde las clases hijas.
//Para acceder a sus metodos lo haces desde las clases hijas.

abstract  class FiguraGeometrica {
    public abstract void dibujar ();
    public abstract void delinear ();
    public  abstract  void  calcularRadio();

}

class Rectangulo extends FiguraGeometrica {


    public void dibujar(){
        System.out.println("Dibujando rectangulo ...");
    }

    @Override
    public void delinear() {
        System.out.println("Delineando rectangulo...");

    }

    @Override
    public void calcularRadio() {

    }


}

class Circulo extends  FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo...");
    }

    @Override
    public void delinear() {
        System.out.println("Delineando circulo...");
    }

    public void calcularRadio () {
        System.out.println("Calculando radio...");
    }
}
