import java.time.LocalDate;
import java.time.Period;
public class ejercicio409 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre(nombre:"Ana");
        p1.setFechaNacimiento(LocalDate.of(1988 , 10 , 20));
        Persona p2 = new Persona();
        p2.setNombre(nombre: "Luis");
        p2.setFechaNacimiento(LocalDate.of(1988 , 10 , 20));
        p1.saludar();
        p2.saludar();
        ahora = LocalDate.now();

    }
}
class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona() {
        //Opcional inicializacion
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(LocalDate  fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    void saludar() {
        System.out.println("Hola soy "+nombre+" y tengo "+getEdad()+" años.");
    }
}u