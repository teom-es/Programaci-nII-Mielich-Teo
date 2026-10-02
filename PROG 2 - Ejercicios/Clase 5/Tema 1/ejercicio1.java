public class ejercicio1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Teo", 45943557, 22);
        Persona p2 = new Persona("Juan", 84939385, 19);
        Persona p3 = new Persona("Pedro", 19385735, 20);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

}

class Persona {
    private String nombre;
    private int dni;
    private int edad;

    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Dni: " + dni + " Edad: " + edad;
    }
}