package sobreescritura;

public class Perro extends Animal {


    public void hacerRuido () {
        System.out.println("Estoy landrando..");
    }


    //Sobreescritura de metodos
    @Override
    public void comer() {
        System.out.println("Accedo al metodo comer() de la clase padre y la sobreescribo");
        System.out.println("Como 10 veces al dia..");

        System.out.println("Tambien puedo utilizar el metodo comer() de la clase padre sin sobreescribirlo");
        super.comer();
    }

    @Override
    public void dormir() {
        System.out.println("Accedo al metodo dormir() de la clase padre y la sobreescribo");
        System.out.println("Duermo 10 horas al dia..");

        System.out.println("Tambien puedo utilizar el metodo dormir() de la clase padre sin sobreescribirlo");
        super.dormir();

    }
}
