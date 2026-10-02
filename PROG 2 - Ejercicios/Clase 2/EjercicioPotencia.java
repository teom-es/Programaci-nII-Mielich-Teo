import java.util.Scanner;

public class EjercicioPotencia {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner var1 = new Scanner(System.in);
        System.out.println("Ingrese un numero exponente");
        Scanner var2 = new Scanner(System.in);
        int numero = var1.nextInt();
        int potencia = var2.nextInt();
        var1.close();
        var2.close();
        System.out.println("Resultado recursion: " + Potenciacion(numero, potencia));
        int result = numero;
        for (int i = 1; i < potencia; i++) {
            result = result * numero;
        }
        System.out.println("Resultado iteracion: " + result);
    }

    public static int Potenciacion(int n, int p) {
        if (p == 1) {
            return n; // caso base
        } else {
            return n * Potenciacion(n, p - 1); // caso recursivo
        }
    }
}
