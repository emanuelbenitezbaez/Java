public class Squirtel extends Pokemon implements IAgua{

    public Squirtel() {

    }

    @Override
    protected void placaje() {
        System.out.println("Hola soy Squirtel y estoy atacando con placaje");
    }

    @Override
    protected void Araniazo() {
        System.out.println("Hola soy Squirtel y estoy atacando con arañazo");
    }

    @Override
    protected void Mordisco() {
        System.out.println("Hola soy Squirtel y estoy atacando con mordizco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtel y estoy atacando con Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtel y estoy atacando con Pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtel y estoy atacando con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Hola soy Squirtel y estoy atacando con hidropulso");
    }
}
