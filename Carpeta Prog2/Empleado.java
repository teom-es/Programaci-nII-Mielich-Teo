public class Empleado {
    // Atributos privados
    private String nombre;
    private int legajo;

    // Constructor parametrizado
    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    // Método que por ahora retorna 0 (se completará en la Clase 6)
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                '}';
    }

    // Método aparte que calcula y muestra legajo más bajo y más alto
    public static void mostrarExtremosDeLegajo(Empleado[] empleados) {
        if (empleados == null || empleados.length == 0) {
            System.out.println("El arreglo de empleados está vacío.");
            return;
        }

        Empleado empleadoMenorLegajo = empleados[0];
        Empleado empleadoMayorLegajo = empleados[0];

        for (int i = 1; i < empleados.length; i++) {
            if (empleados[i].getLegajo() < empleadoMenorLegajo.getLegajo()) {
                empleadoMenorLegajo = empleados[i];
            }
            if (empleados[i].getLegajo() > empleadoMayorLegajo.getLegajo()) {
                empleadoMayorLegajo = empleados[i];
            }
        }

        System.out.println("Legajo más bajo: " + empleadoMenorLegajo.getLegajo() +
                " (" + empleadoMenorLegajo.getNombre() + ")");
        System.out.println("Legajo más alto: " + empleadoMayorLegajo.getLegajo() +
                " (" + empleadoMayorLegajo.getNombre() + ")");
    }

    // Método main de prueba
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Empleado("Ana García", 1042);
        empleados[1] = new Empleado("Juan Pérez", 1008);
        empleados[2] = new Empleado("Lucía Fernández", 1075);
        empleados[3] = new Empleado("Martín Sosa", 1021);

        // Mostrar todos los empleados
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        System.out.println("---");

        // Llamada al método aparte
        mostrarExtremosDeLegajo(empleados);
    }
}