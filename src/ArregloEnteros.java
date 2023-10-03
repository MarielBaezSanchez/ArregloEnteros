import java.util.Scanner;
public class ArregloEnteros {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //tamaño de un arreglo de enteros
        System.out.print("Introduce el tamaño del arreglo: ");
        int size = scanner.nextInt();

        //declarar y construir un arreglo de enteros del tamaño leído
        int[] array = new int[size];

        //valores enteros del arreglo(introducir)
        for (int i = 0; i < size; i++) {
            System.out.print("Introduce el valor " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        // variables para valor maximo y valor pequeño
        int max = 0;
        int min = 0;
        // Variables para valores impares y pares
        int impar = 0;
        int par = 0;

        //recorrer el arreglo para encontrar los valores
        for (int value : array) {
            //valor máximo del arreglo
            if (value > max) {
                max = value;
            }
            //valor mas pequeño del arreglo
            if (value < min) {
                min = value;
            }
            //valores impares en el arreglo
            if (value % 2 != 0) {
                impar++;
            }
            //valores pares en el arreglo
            else {
                par++;
            }
        }

        // Mostramos los resultados
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Número de valores impares: " + impar);
        System.out.println("Número de valores pares: " + par);
    }
}
