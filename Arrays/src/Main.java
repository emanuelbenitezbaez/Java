import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //El array es un tipo de dato que contiene datos del mismo tipo.
        //El array se puede modificar

        int [] arrays = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < arrays.length;i++){
            System.out.println("Arrays: " + arrays[i]);
        }

        String [] cadena= {"ygfg","ujhiuh","yhgy","hgfug","pvrxtr"};

        for(int i = 0; i < cadena.length;i++){
            System.out.println("Cadenas: " + cadena[i]);
        }
    }
}