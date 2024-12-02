package MetodoEstatico;

public class EjecutarConversor {
    public static void main(String[] args) {

        double resultadoCelsiusFah = ConversorTemperatura.celsiusAFahrenheit(25);
        double resltadoFahrenheitCels = ConversorTemperatura.fahrenheitACelsius(77);


        System.out.println("Celsius a fahrenheit :" + resultadoCelsiusFah);
        System.out.println("Fahrenheit a celsius :" + resltadoFahrenheitCels);
    }
}
