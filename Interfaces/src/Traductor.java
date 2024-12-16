public interface Traductor {
    // Tiene metodos publicos y abstractos(por default) que tienen que ser implementadas por las clases hijas.

     void traducir();

     //Metodos con implementacion por default
     default void iniciarTraductor(){
          System.out.println("Iniciando traductor...");
     }


      class Ingles implements Traductor {

          @Override
          public void traducir() {
               System.out.println("Traduciendo al ingles...");
          }


     }

     class Frances implements  Traductor {

          @Override
          public void traducir() {
               System.out.println("Traduciendo al frances...");
          }

          @Override
          public void iniciarTraductor() {
               System.out.println("Iniciando traduccion al frances...");
          }
     }


}




