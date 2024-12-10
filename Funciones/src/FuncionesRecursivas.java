

public class FuncionesRecursivas {

    static void recursiva (int numero) {
       if (numero==1){
           System.out.println(numero);
       }else {
           //caso recursivo
           System.out.println(numero);
           recursiva(numero-1);
       }
    }
    public static void main(String[] args) {
        //La funcion recursiva es una funcion que se llama a si misma y tiene ciertas reglas.
        //1 - Llamada  a si misma.
        //2 - Debe avanzar hacia un caso base o cae en bucle infinito.

        //Imprimir del 10 al 1
        
        //LLamada funcion
        recursiva(10);

    }
}
