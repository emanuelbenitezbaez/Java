
public class Main {
    public static void main(String[] args) {

        //Una interface no puede ser instanciada proque tiene metodos abstractos.
        //Por eso usamos una clase concreta, Ingles o Frances en este caso.
        Traductor ingles = new Traductor.Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances = new Traductor.Frances();
        frances.iniciarTraductor();
        frances.traducir();

    }
}