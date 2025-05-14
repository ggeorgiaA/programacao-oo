class ContaCorrente extends Conta {
    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente - Cliente: " + cliente + ", Saldo: " + saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.001;
    }
}
