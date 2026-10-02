import java.util.Scanner;

public class EjercicioSuma {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner var = new Scanner(System.in);
        int numero = var.nextInt();
        var.close();
        System.out.println("Suma de sus digitos: " + sumarDigitos(numero));
    }

    public static int sumarDigitos(int n) {
        if (n < 10) {
            return n; // caso base
        } else {
            return (n % 10) + sumarDigitos(n / 10); // caso recursivo
        }
    }
}
