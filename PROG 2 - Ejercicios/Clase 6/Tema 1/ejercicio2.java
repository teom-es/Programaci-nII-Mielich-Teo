public class ejercicio2 {
    public static void main(String[] args) {
        Figura figura1 = new Circulo("Circulo", 20);
        Figura figura2 = new Rectangulo("Rectangulo", 20, 30);
        System.out.println(figura1);
        System.out.println(figura2);
    }
}

class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Figura: " + getNombre() + " Radio: " + radio + " cm";
    }
}

class Rectangulo extends Figura {
    private int base;
    private int altura;

    public Rectangulo(String nombre, int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Figura: " + getNombre() + " Altura: " + altura + " cm  Base: " + base + " cm";
    }
}