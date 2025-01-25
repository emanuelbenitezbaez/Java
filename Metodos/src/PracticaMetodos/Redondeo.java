package PracticaMetodos;

import java.text.DecimalFormat;

public class Redondeo {
    public static void main(String[] args) {

        double numero = 8.55;
        var numero_redondeado = Math.round(numero);
        System.out.println("Resultado: " + numero_redondeado);
        //FORMATO

        var patron = "##.##";
        DecimalFormat decimalFormat = new DecimalFormat(patron);
        var numeroFormateado = decimalFormat.format(numero);

        System.out.println("Numero formateado: " +numeroFormateado);
    }
}
