import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        int edades [] = {12,23,45,56,67,77};

        List<String> frutas = new ArrayList<>();
              frutas.add("banana");
        frutas.add("naranja");
        frutas.add("mandarina");
        frutas.add("sandia");

        for (String fruta : frutas) {

            System.out.println("Fruta  : " +fruta);
        }

        for (int edad : edades) {
            System.out.println("Edad: " + edad);
        }


    }
}
