public class hola {
    
    // 1. El método main es el punto de entrada
    public static void main(String[] args) {
        // Aquí LLAMAMOS al procedimiento pasándole un argumento
        saludarUsuario("Teo"); 
        double[] notas = {8,3,7};
        double promedio = calcularPromedio(1,2,3);
        System.out.println("Tu promedio es: "+ promedio);
        double promedio2 = promedioMatriz(notas);
        System.out.println("Tu promedio es: "+ promedio2);
        System.out.println(notas[0]);
    }

    // 2. Procedimiento: Realiza una acción y NO retorna valor (void)
    // Se declara FUERA del main, pero DENTRO de la clase
    public static void saludarUsuario(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido a Programación II.");
    }
    // Función: Procesa datos y RETORNA un valor de un tipo específico (double)
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        double suma = nota1 + nota2 + nota3;
        return suma / 3.0;
    }
    
    public static double promedioMatriz(double[] valores) {
        double suma = valores[0] + valores[1] + valores[2];
        valores[0] = 0;
        return suma / 3.0;
    }
}

