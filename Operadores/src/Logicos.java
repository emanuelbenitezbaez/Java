public class Logicos {
    public static void main(String[] args) {
        System.out.println("Operadores Lógicos");
        System.out.println("Estos operadores se utilizan para combinar expresiones booleanas.");
        System.out.println("AND lógico (&&): Devuelve true si ambos operandos son true.");
        boolean a = true;
        boolean b = false;
        boolean resultado = (a && b);  // resultado será false
        System.out.println("a:true && b:false" + resultado);

        System.out.println("OR lógico (||): Devuelve true si al menos uno de los operandos es true.");
        boolean a1 = true;
        boolean b1 = false;
        boolean resultado1= (a1 || b1);
        System.out.println("a1:true || b1:false : " + resultado1);// resultado será true

        System.out.println("NOT lógico (!): Niega el valor de un operando booleano.");
        boolean a2 = true;
        boolean resultado2 = !a2;  // resultado será false
        System.out.println("a2:true : "+resultado2);



    }
}
