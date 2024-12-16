public class ArgumentosVariables {
    public static void main(String[] args) {
        //Pasar multiples parametros a una funcion:

        imprimirNumeros(12,122,134,56);
        variosParametros("Emanuel",1,2,3,4,5,6,7);
    }

    static  void imprimirNumeros (int... number){

        for (int numeros : number) {
            System.out.println(numeros);
        }

    }
    static  void variosParametros (String name, int... numeros) {
        System.out.println("Nombre: " + name);
        imprimirNumeros(numeros);
    }
}
