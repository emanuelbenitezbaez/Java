public class CicloDoWhile {
    public static void main(String[] args) {
        //CICLOS: DO WHILE
        //Ejecuta al menos una vez su bloque de codigo porque la condicion se encuentra al final.

        var numero = 20;
        var contador = 1;
        do{
            System.out.println("Numero:" + contador);
            contador++;
        }while (contador <= numero);
    }
}
