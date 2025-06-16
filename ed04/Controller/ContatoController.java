import java.util.ArrayList;
import java.util.List;

public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        if (contato instanceof PessoaFisica pf) {
            for (Contato c : contatos) {
                if (c instanceof PessoaFisica pfExistente && pfExistente.getCpf().equals(pf.getCpf())) {
                    throw new IllegalArgumentException("Contato com este CPF já existe.");
                }
            }
        } else if (contato instanceof PessoaJuridica pj) {
            for (Contato c : contatos) {
                if (c instanceof PessoaJuridica pjExistente && pjExistente.getCnpj().equals(pj.getCnpj())) {
                    throw new IllegalArgumentException("Contato com este CNPJ já existe.");
                }
            }
        }
        contatos.add(contato);
    }

    public void remover(String documento) {
        contatos.removeIf(c -> (c instanceof PessoaFisica pf && pf.getCpf().equals(documento)) ||
                                (c instanceof PessoaJuridica pj && pj.getCnpj().equals(documento)));
    }

    public List<Contato> listar() {
        return contatos;
    }

}
