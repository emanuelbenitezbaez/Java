package Polimorfismo;

public class EjecutarSuperHeroes {
    public static void main(String[] args) {

        SuperHeroe[] heroes = new SuperHeroe[3];
        heroes[0]= new SuperHeroe("Heroe1","Raza1");
        heroes[1]= new Batman("El señor de la noche","Humano","Bruce Wayne","Ciudad Gotica","Millonario");
        heroes[2]= new Superman("EL hombre de acero","Kriptoniano","Clark Kent","Metropolis","Reportero","Kriptonita");

        for (SuperHeroe supers : heroes){
            System.out.println(supers.datos_heroes());
        }


    }
}
