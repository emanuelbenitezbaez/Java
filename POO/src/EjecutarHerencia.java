public class EjecutarHerencia {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador(4,"93884916","Emanuel","Benitez Baez","Chimondegui 1024","1198766554",897,"Estudiante",1887009);
        colaborador.mostrarDetalles();

        Consultor consultor = new Consultor(4,"93884916","Emanuel","Benitez Baez","Chimondegui 1024","1198766554","Globant",23);
        consultor.mostrarDetallesDeConsultor();


        //Colaborador:
        System.out.println("Colaborador");
        System.out.println("Domicilio del colaborador: " + colaborador.getDomicilio());
        System.out.println("Numero de legajo del colaborador: " + colaborador.getNum_legajo());
        

        //Consultor:
        System.out.println("Consultor");
        System.out.println("Domicilio del consultor: " + consultor.getDomicilio());
        System.out.println("Numero de legajo del consultor: " + consultor.getNumero_consultor());
        System.out.println("Consultora: " + consultor.getNombre_consultora());

    }
}
