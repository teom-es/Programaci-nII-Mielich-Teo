public class ejercicio1 {
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

class EmpleadoPorHoras extends Empleado {
    private int horas_trab;
    private int valor_hora;

    public EmpleadoPorHoras(String nmombre, int legajo, int horas_trab, int valor_hora) {
        super(nmombre, legajo);
        this.horas_trab = horas_trab;
        this.valor_hora = valor_hora;
    }

    public int getHoras_trab() {
        return horas_trab;
    }

    public int getValor_hora() {
        return valor_hora;
    }
}

class EmpleadoAsalariado extends Empleado {
    private int sueldo_bas;
    private int bono;

    public EmpleadoAsalariado(String nmombre, int legajo, int sueldo_bas, int bono) {
        super(nmombre, legajo);
        this.sueldo_bas = sueldo_bas;
        this.bono = bono;
    }

    public int getSueldo_bas() {
        return sueldo_bas;
    }

    public int getBono() {
        return bono;
    }
}