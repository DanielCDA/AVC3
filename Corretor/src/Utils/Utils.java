package Corretor.src.Utils;

import java.util.Scanner;

public class Utils {
    public static int makeMenu(String[] opcoes) {
        Scanner scanner = new Scanner(System.in);
        int opcaoSelecionada;

        do {
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i+1) + " - " + opcoes[i]);
            }
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.print("Selecione uma opcao: ");
            opcaoSelecionada = scanner.nextInt();
        } while (opcaoSelecionada < 0 || opcaoSelecionada > opcoes.length);

        return opcaoSelecionada;
    }
}
