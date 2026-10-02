import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria("CabralMotors");

        // Cargamos 5 vehículos de marcas distintas
        concesionaria.agregarVehiculo(new Vehiculo("Toyota", "Corolla", 25000));
        concesionaria.agregarVehiculo(new Vehiculo("Ford", "Focus", 22000));
        concesionaria.agregarVehiculo(new Vehiculo("Chevrolet", "Onix", 18000));
        concesionaria.agregarVehiculo(new Vehiculo("Volkswagen", "Gol", 20000));
        concesionaria.agregarVehiculo(new Vehiculo("Fiat", "Cronos"));

        // Marca de vehiculo encontrado
        System.out.println("Búsqueda 'Ford': " + concesionaria.buscarPorMarca("Ford"));

        // Marca de vehiculo no encontrado
        System.out.println("Búsqueda 'Honda': " + concesionaria.buscarPorMarca("Honda"));

        // Valor total del stock
        System.out.println("Valor total del stock: $" + concesionaria.valorTotalStock());
    }
}

class Concesionaria {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public Vehiculo buscarPorMarca(String marca) {
        for (Vehiculo v : vehiculos) {
            if (v.getMarca().equalsIgnoreCase(marca)) {
                return v;
            }
        }
        return null;
    }

    public double valorTotalStock() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getPrecio();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }
}

class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    // Constructor completo
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this(marca, modelo, 0.0);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - $" + precio;
    }
}
