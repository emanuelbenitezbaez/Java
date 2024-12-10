public class ObtenerLargo {
    public static void main(String[] args) {




        System.out.println("Longitud con la funcion 1 : " +longitudCadena());
        System.out.println("Longitud con la funcion 2: " +longitudCadena2());

    }


    public static int longitudCadena(){
        String cadena = "Longitud";
        int contador=0;
        for (int i =0; i < cadena.length();i++){
            contador++;
        }
        return contador;
    }

    public static int longitudCadena2(){
        String cadena = "Longitud";
        return  cadena.length();
    }


}
