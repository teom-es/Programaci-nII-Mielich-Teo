public class ejercicio2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo("Circulo", 20);
        figuras[1] = new Rectangulo("Rectangulo", 20, 30);
        figuras[2] = new Circulo("Circulo", 30);
        figuras[3] = new Rectangulo("Rectangulo", 40, 50);
        for (int i = 0; i < figuras.length; i++) {
            System.out.println(figuras[i]);
            System.out.println("Area: " + calcularArea(figuras, i));
        }
    }

    public static double calcularArea(Figura[] figuras, int y) {
        if ((figuras[y]) instanceof Circulo) {
            Circulo circulo = (Circulo) figuras[y];
            return 3.14 * circulo.getRadio() * circulo.getRadio();
        } else {
            Rectangulo rectangulo = (Rectangulo) figuras[y];
            return rectangulo.getBase() * rectangulo.getAltura();
        }
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