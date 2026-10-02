public class ejercicio1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana García", 30456789, 28);
        Persona p2 = new Persona("Juan Pérez", 28765432, 35);
        Persona p3 = new Persona("Lucía Fernández", 40123456, 22);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

class Persona {
    // Atributos privados
    private String nombre;
    private int dni;
    private int edad;
    
    // Constructor parametrizado
    public Persona(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    // Getters (opcionales, pero buena práctica)
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    // toString sobreescrito
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", edad=" + edad +
                '}';
    }
}