import java.util.Scanner;

public class Duplicacion {
    public static void main(String[] args) {
        System.out.println("Ingrese 5 valores para insertar en un arreglo");
        Scanner var = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = var.nextInt();
        }
        var.close();
        System.out.println("Arreglo antes del metodo duplicarValores: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        duplicarValores(numeros);
        System.out.println("Arreglo despues del metodo duplicarValores: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void duplicarValores(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
}
