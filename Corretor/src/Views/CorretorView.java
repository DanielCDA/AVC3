package Corretor.src.Views;

import java.util.ArrayList;

import Corretor.src.Models.Carteira;
import Corretor.src.Models.Corretor;
import Corretor.src.Models.Firma;

public class CorretorView extends BaseView{
    private CorretorController controller;
    private CarteiraController carteiraController;
    public CorretorView(CorretorController controller, CarteiraController carteiraController){
        this.controller = controller;
        this.carteiraController = carteiraController;
    }

    public Corretor show(Firma firma) {
        System.out.print("Digite o nome do corretor: ");
        String nome = scanner.nextLine();
        System.out.println("Data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.println("Genero: ");
        String sexo = scanner.nextLine();
        System.out.println("Morada: ");
        String morada = scanner.nextLine();
        System.out.println("Endereco E-mail: ");
        String email = scanner.nextLine();
        System.out.println("Numero de de telefone");
        int contacto = scanner.nextInt();
        System.out.println("Palavra-Passe: ");
        String password = scanner.nextLine();
        System.out.print("Digite o numero do bilhete do corretor: ");
        String bi = scanner.nextLine();
        System.out.println("Data de admissao: ");
        String dataAdmissao = scanner.nextLine();
        System.out.println("Data de recisao");
        String dataRecisao = scanner.nextLine();
        System.out.println("Salario base:");
        float salarioBase = scanner.nextFloat();


        Corretor corretor = new Corretor(nome, dataNascimento, sexo, morada, email,
                contacto, password, bi, dataAdmissao, dataRecisao, salarioBase, firma);
        controller.cadastrar(corretor);

        System.out.println("Corretor cadastrado com sucesso!");

        return null;
    }

    public void menuCorrector(Corretor corretor) {
        String[] opcoes = { "Meus Clientes" };

        System.out.println("Menu Corrector");
        System.out.println("");
        int opcao = Utils.makeMenu(opcoes);

        switch (opcao) {
            case 1 -> {
                this.getListaDeClientes(corretor);
            }
            default -> {
                System.out.println("Saindo...");
            }
        }
    }

    private void getListaDeClientes(Corretor corretor) {
        ArrayList<Carteira> carteiras = this.carteiraController.getCarteirasPorCorrector(corretor);

        for (int i = 0; i < carteiras.size(); i++) {
            Carteira carteira = carteiras.get(i);
            System.out.println((i + 1) + " - " + carteira.getClienteAssociated().getNome());
        }
    }

    public Corretor getListaDeCorretoresPorFirma(Firma firma) {
        ArrayList<Corretor> corretors = this.controller.getListaDeCorretoresPorFirma(firma);
        int selecao;

        do {
            for (int i = 0; i < corretors.size(); i++) {
                Corretor corretor = corretors.get(i);
                System.out.println((i + 1) + " - " + corretor.getNome());
            }
            System.out.println("0 - Voltar");
            System.out.println("");
            System.out.print("Selecione um corretor: ");
            selecao = this.scanner.nextInt();
        } while (selecao < 0 || selecao > corretors.size());

        if (selecao == 0) return null;

        return corretors.get(selecao - 1);
    }

}
