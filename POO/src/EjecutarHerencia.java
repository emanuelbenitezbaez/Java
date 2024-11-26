public class EjecutarHerencia {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador(4,"93884916","Emanuel","Benitez Baez","Chimondegui 1024","1198766554",897,"Estudiante",1887009);
        colaborador.mostrarDetalles();

        Consultor consultor = new Consultor(4,"93884916","Emanuel","Benitez Baez","Chimondegui 1024","1198766554","Globant",23);


        consultor.mostrarDetallesDeConsultor();



    }
}
