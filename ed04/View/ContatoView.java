import java.util.List;
import java.util.Scanner;

public class ContatoView {
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu(){
        System.out.println("Menu de Contatos:");
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Remover Contato");
        System.out.println("3. Listar Contatos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void mostrarContatos(List<Contato> contatos) {
        System.out.println("\n===== LISTA DE CONTATOS =====");
        for (Contato c : contatos) {
            System.out.printf("Nome: %s | Telefone: %s | Email: %s",
                              c.getNome(), c.getTelefone(), c.getEmail());
            if (c instanceof PessoaFisica pf) {
                System.out.printf(" | CPF: %s\n", pf.getCpf());
            } else if (c instanceof PessoaJuridica pj) {
                System.out.printf(" | CNPJ: %s\n", pj.getCnpj());
            }
        }
        System.out.println();
    }

     public String input(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

}
