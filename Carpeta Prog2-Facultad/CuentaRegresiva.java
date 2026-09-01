public class CuentaRegresiva {

    public static void main(String[] args) {
        System.out.println("Iniciando conteo...");
        conteoRecursivo(5); // Llamada inicial con el número 5
    }

    /**
     * Método recursivo para contar hacia atrás.
     * @param numero  El número actual del conteo.
     */
    public static void conteoRecursivo(int numero) {
        // 1. CASO BASE: ¿Llegamos al final del conteo?
        if (numero == 0) {
            System.out.println("0. ¡IGNICIÓN! 🚀");
            return; // Detiene la recursividad y "desapila" las llamadas
        }

        // 2. ACCIÓN: Imprimimos el número actual ANTES de llamar de nuevo
        System.out.println(numero + "...");

        // 3. LLAMADA RECURSIVA: Llamamos al método con el siguiente número (n-1)
        conteoRecursivo(numero - 1);
    }
}