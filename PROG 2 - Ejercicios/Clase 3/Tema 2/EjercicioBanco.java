public class EjercicioBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", "123456", 10000);
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        // Intentar asignar un titular vacío
        try {
            cuenta.setTitular("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Intentar asignar un saldo negativo
        try {
            cuenta.setSaldo(-5000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("----------------------------");
        System.out.println("Cuenta Bancaria: " + cuenta.getTitular());
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        // Operación de deposito valida
        try {
            cuenta.depositar(1000);
            System.out.println("Deposito realizado, saldo actual: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Operación de extracción valida
        try {
            cuenta.extraer(1000);
            System.out.println("Extracción realizada, saldo actual: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Operación de deposito invalida
        try {
            cuenta.depositar(-1000);
            System.out.println("Deposito realizado, saldo actual: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Operación de extracción invalida
        try {
            cuenta.extraer(20000);
            System.out.println("Extracción realizada, saldo actual: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class CuentaBancaria {
    // Atributos privados
    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        setTitular(titular);
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
    }

    // Getter del titular
    public String getTitular() {
        return titular;
    }

    // Setter del titular con validación
    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("El titular no puede estar vacío.");
        }
        this.titular = titular;
    }

    // Getter del número de cuenta
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    // Setter del número de cuenta
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // Getter del saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter del saldo con validación
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.saldo = saldo;
    }

    // Metodo de deposito
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar no puede ser negativo o cero");
        }
        saldo += monto;
    }

    // Metodo de extracción
    public void extraer(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a extraer debe ser positivo");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("No hay suficiente dinero para realizar la extraccion");
        }
        saldo -= monto;
    }
}