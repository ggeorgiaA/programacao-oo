class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupança - Cliente: " + cliente + ", Saldo: " + saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.0008;
    }
}
