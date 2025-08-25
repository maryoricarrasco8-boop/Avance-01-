package banco;

public class CheckingAccount {
    private final String numero;
    private double saldo;
    private static final double LIMITE = -500.0;

    public CheckingAccount(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }
    public void depositar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido");
        saldo += monto;
    }
    public void retirar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido");
        if (saldo - monto < LIMITE) throw new IllegalArgumentException("Excede sobregiro permitido");
        saldo -= monto;
    }
    public double getSaldo() { return saldo; }
    public String getNumero() { return numero; }
}
