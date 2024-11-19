public class Main {
    public static void main(String[] args) {

        int numero1= 14240;
        int numero2 = 2242;
        int resultado=  sumar(numero1,numero2);
        System.out.println("La suma de ambos numeros es: "  + resultado);
        restar(numero1,numero2);

    }



    public static int  sumar(int a,int b){
       return  a + b ;
    }
    public  static void  restar(int a,int b){
        int resta;
        resta = a - b;
        System.out.println("La resta  de ambos numeros es: " + resta);
    }
}

