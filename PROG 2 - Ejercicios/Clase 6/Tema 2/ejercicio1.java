public class ejercicio1 {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoAsalariado("teo", 123, 100, 50);
        Empleado empleado2 = new EmpleadoPorHoras("juan", 321, 40, 12);
        System.out.println(empleado1);
        System.out.println(empleado2);
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

    public int CalcularSueldo() {
        return horas_trab * valor_hora;
    }

    @Override
    public String toString() {
        return "Empleado: " + getnombre() + " Legajo: " + getLegajo() + " Sueldo: " + CalcularSueldo();
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

    public int CalcularSueldo() {
        return sueldo_bas + bono;
    }

    @Override
    public String toString() {
        return "Empleado: " + getnombre() + " Legajo: " + getLegajo() + " Sueldo: " + CalcularSueldo();
    }
}