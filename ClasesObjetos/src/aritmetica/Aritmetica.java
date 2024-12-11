package aritmetica;

public class Aritmetica {

    int operando1;
    int operando2;

    //Constructor

    public Aritmetica() {

    }

    public Aritmetica(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    //Metodos
    void sumar (){
        var resultado = operando1 + operando2;
        System.out.println(resultado);
    }
    void restar (){
        var resultado = operando1 - operando2;
        System.out.println(resultado);
    }
}
