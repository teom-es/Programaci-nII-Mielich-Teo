import java.util.Scanner;

public class Intercambio {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Ingrese dos valores para intercambiarlos");
        Scanner var1 = new Scanner(System.in);
        Scanner var2 = new Scanner(System.in);
        x = var1.nextInt();
        y = var2.nextInt();
        var1.close();
        var2.close();
        System.out.println("Variables antes del metodo intercambio: x = " + x + " y = " + y);
        intercambio(x, y);
        System.out.println("Variables despues del metodo intercambio: x = " + x + " y = " + y);
    }

    public static void intercambio(int a, int b) {
        int aux;
        aux = a;
        a = b;
        b = aux;
    }
}
