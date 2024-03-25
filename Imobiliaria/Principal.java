package Imobiliaria;

import java.util.Scanner;

public class Principal {
    private static final int TAMANHO_MAXIMO = 100;
    private static LoginCadastro[] usuarios = new LoginCadastro[TAMANHO_MAXIMO];
    private static int quantidadeUsuarios = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("Bem-vindo à imobiliária!");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    executando = false;
                    break;
                case 1:
                    realizarLogin(scanner);
                    break;
                case 2:
                    realizarCadastro(scanner);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void realizarLogin(Scanner scanner) {
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Senha: ");
        String senha = scanner.next();

        for (int i = 0; i < quantidadeUsuarios; i++) {
            LoginCadastro usuario = usuarios[i];
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                return;
            }
        }

        System.out.println("Email ou senha incorretos.");
    }

}
