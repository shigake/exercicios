import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        boolean sair = false;

        System.out.println("Bem-vindo ao Sistema de Cadastro");
        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Sair");

            opcao = sc.nextLine();

            if (opcao.equals("1")) {
                System.out.println("Digite o nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o email:");
                String email = sc.nextLine();
                System.out.println("Usuário " + nome + " com email " + email + " cadastrado!");
            } else if (opcao.equals("2")) {
                System.out.println("Listando usuários (não implementado)");
            } else if (opcao.equals("3")) {
                System.out.println("Digite o ID para excluir:");
                String id = sc.nextLine();
                System.out.println("Usuário com ID " + id + " excluído!");
            } else if (opcao.equals("4")) {
                sair = true;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Saindo...");
        sc.close();
    }
}