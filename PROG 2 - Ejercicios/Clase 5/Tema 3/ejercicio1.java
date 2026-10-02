public class ejercicio1 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", "123456", 10000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Juan Perez", "123456", 0);
        System.out.println(cuenta);
        System.out.println(cuenta2);
    }
}

class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular, String numeroCuenta) {
        this(titular, numeroCuenta, 0);
    }

    @Override
    public String toString() {
        return "Titular: " + titular + " Cuenta: " + numeroCuenta + " Saldo: " + saldo;
    }
}