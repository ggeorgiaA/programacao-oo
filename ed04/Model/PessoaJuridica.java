public class PessoaJuridica extends ContatoBase {
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String email, String cnpj) {
        super(nome, telefone, email);
        setCnpj(cnpj);}
    
    public void setCnpj(String cnpj) {
        if (cnpj.matches("\\d{14}")) {
            this.cnpj = cnpj;
        } else {
            throw new IllegalArgumentException("CNPJ deve conter 14 dígitos numéricos.");
        }
    }
    public String getCnpj() {
        return cnpj;
    }
}