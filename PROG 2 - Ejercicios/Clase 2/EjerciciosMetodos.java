import java.util.Scanner;

public class EjerciciosMetodos {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para mostrar su tabla de multiplicacion");
        Scanner var = new Scanner(System.in);
        int numero = var.nextInt();
        var.close();
        tabladeMultiplicar(numero);
        int[] valores = { 1, 2, 3, 4, 5 };
        double resultado = promedio(valores);
        System.out.println("\nPromedio: " + resultado);
    }

    public static void tabladeMultiplicar(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static double promedio(int[] valores) {
        int suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        return (double) suma / valores.length;
    }
}
