public class Calculadora {
    //Ejercicio de codificación Parametros (POO)
    //Instrucciones:
    //Crea una clase llamada Calculadora.
    //Implementa los siguientes métodos dentro de la clase:
    //suma: Recibe dos números enteros como parámetros y devuelve la suma de ambos.
    //resta: Recibe dos números enteros como parámetros y devuelve la resta del segundo número al primero.
    //multiplicacion: Recibe dos números enteros como parámetros y devuelve el producto de ambos.
    //division: Recibe dos números enteros como parámetros y devuelve el cociente de la división del primero entre el segundo.
    // Si el divisor es cero, el método debe devolver 0 y no lanzar una excepción.
    //Crea un método principal (main) en una clase separada llamada EjecutarCalculadora,
    // donde se cree una instancia de la clase Calculadora y se prueben los métodos con diferentes entradas.




    //Metodos

    public int sumar(int numero1,int numero2){
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    public int dividir (int numero1, int numero2){

        if(numero2==0){
            return 0;
        }else {
            return numero1 / numero2;
        }
    }
}
