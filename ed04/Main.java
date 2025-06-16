import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
            view.exibirMenu();
            opcao = Integer.parseInt(scanner.nextLine());

            try {
                switch (opcao) {
                    case 1 -> {
                        String tipo = view.input("Pessoa Física (F) ou Jurídica (J)? ").toUpperCase();
                        String nome = view.input("Nome: ");
                        String telefone = view.input("Telefone: ");
                        String email = view.input("Email: ");

                        if (tipo.equals("F")) {
                            String cpf = view.input("CPF (11 dígitos): ");
                            controller.adicionar(new PessoaFisica(nome, telefone, email, cpf));
                        } else if (tipo.equals("J")) {
                            String cnpj = view.input("CNPJ (14 dígitos): ");
                            controller.adicionar(new PessoaJuridica(nome, telefone, email, cnpj));
                        }
                    }
                    case 2 -> view.mostrarContatos(controller.listar());
                    case 3 -> {
                        String doc = view.input("Informe o CPF ou CNPJ do contato a ser removido: ");
                        controller.remover(doc);
                    }
                    case 0 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 0);

        scanner.close();
    }
}

