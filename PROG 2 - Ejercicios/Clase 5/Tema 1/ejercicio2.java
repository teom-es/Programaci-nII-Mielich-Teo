public class ejercicio2 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Empleado("Juan", 1234);
        empleados[1] = new Empleado("Pedro", 4321);
        empleados[2] = new Empleado("Ana", 5421);
        empleados[3] = new Empleado("Luana", 8934);
        mostrarlegajos(empleados);
    }

    public static void mostrarlegajos(Empleado[] empleados) {
        int minLegajo = empleados[0].getLegajo();
        int maxLegajo = empleados[0].getLegajo();
        for (int i = 0; i < empleados.length; i++) {
            int legajoActual = empleados[i].getLegajo();
            if (legajoActual < minLegajo) {
                minLegajo = legajoActual;
            }
            if (legajoActual > maxLegajo) {
                maxLegajo = legajoActual;
            }
        }
        System.out.println("Legajo más bajo: " + minLegajo);
        System.out.println("Legajo más alto: " + maxLegajo);
    }
}

class Empleado {
    private String nombre;
    private int legajo;

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getnombre() {
        return nombre;
    }

    public int CalcularSueldo() {
        return 0;
    }
}
