public class Bulbasaur extends Pokemon implements IPlanta {



public  Bulbasaur(){}

    @Override
    protected void placaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con placaje");
    }

    @Override
    protected void Araniazo() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con arañazo");
    }

    @Override
    protected void Mordisco() {
        System.out.println(" Hola soy Bulbasaur y estoy atacando con mordizco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Hola soy Bulbasaur y estoy atacando con Latigo cepa");
    }
}
