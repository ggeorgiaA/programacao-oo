public abstract class Conta {
    protected String cliente;
    protected double saldo;

    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void imprimirExtrato();

    public abstract void aplicarJurosDiarios();
}
