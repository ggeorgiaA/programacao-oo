class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Salário - Cliente: " + cliente + ", Saldo: " + saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Conta Salário não aplica juros
    }
}
