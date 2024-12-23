public class Main {
    public static void main(String[] args) {

        System.out.println("Array estatico harcodeado");

        int[] arr = {1, 2, 3, 4, 5};
       for(int numbers : arr){
              System.out.println(numbers);
       }

        System.out.println("Array estatico con bucle");

       int[] numbers = new int[5];

         for(int i = 0; i < numbers.length; i++){
              numbers[i] = i + 1;
         }

         for(int number : numbers){
                System.out.println(number);
         }

        System.out.println("Array de Strings");

       String[] names = {"John", "Jane", "Joe", "Jack"};

         for(String name : names){
              System.out.println(name);
         }


        System.out.println("Matriz estatica harcodeada");

       int [][] matrix = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
       };

            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }


        System.out.println("Matriz estatica con bucle");

       int [][] matrices = new int[3][3];

         for(int i = 0; i < matrices.length; i++){
              for(int j = 0; j < matrices[i].length; j++){
                matrices[i][j] = i + j;
              }
         }

         


    }


}