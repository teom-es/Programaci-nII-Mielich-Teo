//el problema pide  determinar si un numero es entero, este problema se puede resolverr usaando un ciclo repetitivo for yendo de 1 en 1 en los numeros divisores y verificando si el numero es divisible por numeros del 2 al 10, si es verdad que es divisible por uno o mas numeros de este rango el numero no es primo, sino es primo

public class entero {
    public static void main(String[] args) {
        int numero = -10;
        int cont = 0;
        if (numero >= 0) {
            for (int i = 2; i <= 10; i++) {
                if ((numero % i) == 0) {
                    cont += 1;
                }
            }
            if (cont > 1) {
                System.out.println("el numero no es primo");
            } else {
                System.out.println("el numero es primo");
            }
        } else {
            System.out.println("error numero negativo");
        }
            
    }
}