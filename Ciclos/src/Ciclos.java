public class Ciclos {
    public static void main(String[] args) {
        //WHILE
        //Repite la ejecución del bloque de codigo mientras la condicion sea verdadera.
        //Declara una variable numero e inicialízala en 2.
        //Utiliza un bucle while para sumar los números pares del 2 al 20. Imprime el resultado de la suma.


        var numero = 2;
        var sumaPares = 0;


        while (numero <= 20){
             sumaPares = sumaPares + numero;
             numero = numero + 2;

             System.out.println("Suma: " + sumaPares);
        }


        //Ejercicio #2.
        //
        //Declara una variable numero e inicialízala en 1.
        //Utiliza un bucle while para calcular el producto de los números del 1 al 5. Imprime el resultado del producto.
        var number = 20;
        var contador = 1;
        var resultado = 0;

        while (contador <= 5){
            resultado = number * contador;
            System.out.println("Resultado de " + number + " por " + contador + " : "+ resultado);
            contador++;
        }

    }
}
