public class Pikachu extends Pokemon implements IElectrico{




    @Override
    protected void placaje() {
        System.out.println("Hola soy pikachu y estoy atacando con placaje");
    }

    @Override
    protected void Araniazo() {
        System.out.println("Hola soy pikachu y estoy atacando con arañazo");
    }

    @Override
    protected void Mordisco() {
        System.out.println("Hola soy pikachu y estoy atacando con mordizco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy pikachu y estoy atacando con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy pikachu y estoy atacando con Puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println(" Hola soy pikachu y estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Hola soy pikachu y estoy atacando con Rayo carga");
    }
}
