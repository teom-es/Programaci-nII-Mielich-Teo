import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int numero = var.nextInt();
        var.close();
        if (numero >= 0) {
            if (esPrimo(numero) == 1) {
                System.out.println("el numero es primo");
            } else {
                System.out.println("el numero no es primo");
            }
        } else {
            System.out.println("error numero negativo");
        }
    }

    public static int esPrimo(int n) {
        int cont = 1;
        for (int i = 2; i <= 10; i++) {
            if ((n % i) == 0) {
                cont += 1;
            }
        }
        if (cont == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}
