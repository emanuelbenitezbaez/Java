public class Charmander extends Pokemon implements IFuego{


    @Override
    protected void placaje() {
        System.out.println("Hola soy Charmander y estoy atacando con placaje");
    }

    @Override
    protected void Araniazo() {
        System.out.println("Hola soy Charmander y estoy atacando con arañazo");
    }

    @Override
    protected void Mordisco() {
        System.out.println("Hola soy Charmander y estoy atacando con mordizco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y estoy atacando con Puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y estoy atacando con Ascuas");
    }

    @Override
    public void atacarlanzaLlamas() {
        System.out.println("Hola soy Charmander y estoy atacando con Lanza llamas");
    }
}
