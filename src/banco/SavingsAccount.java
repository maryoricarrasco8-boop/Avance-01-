package banco;

public class SavingsAccount {
    private final String numero;
    private double saldo;

    public SavingsAccount(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }
    public void depositar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido");
        saldo += monto;
    }
    public void retirar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido");
        if (saldo - monto < 0) throw new IllegalArgumentException("Ahorro no permite saldo negativo");
        saldo -= monto;
    }
    public double getSaldo() { return saldo; }
    public String getNumero() { return numero; }
}

