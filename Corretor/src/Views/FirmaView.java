package Corretor.src.Views;

import Corretor.src.Models.Corretor;
import Corretor.src.Models.Firma;

public class FirmaView extends BaseView implements BaseViewInterface {
    private FirmaController controller;
    private CorretorView corretorView;
    private ClienteView clienteView;
    public FirmaView(FirmaController controller, CorretorView corretorView, ClienteView clienteView){
        this.controller = controller;
        this.corretorView = corretorView;
        this.clienteView = clienteView;
    }

    @Override
    public Firma show(){

        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("");
        System.out.print("E-mail: ");
        String email = scanner.next();
        System.out.print("Palavvra-Passe: ");
        String password = scanner.next();


        Firma firma = new Firma(nome, email, password);
        controller.cadastrar(firma);

        System.out.println("Cadastro bem-sucedido !");

        return null;
    }

    public void getFirmaMenu(Firma firma) {
        int opcaoSelecionada;
        do {
            String[] opcoes = {
                    "Cadastro",
                    "Gerir Correctores",
                    "Gerir Clientes",
                    "Gerir Carteiras",
                    "Ver Movimentações"
            };

            System.out.println("Menu firma");
            System.out.println("");
            opcaoSelecionada = Utils.makeMenu(opcoes);

            switch (opcaoSelecionada) {
                case 1 -> {
                    String[] opcaesCadastro = {"Corretor", "Cliente"};

                    System.out.println("Quem deseja cadastrar?");
                    System.out.println("");
                    int opcaoCadastroSelecionada = Utils.makeMenu(opcaesCadastro);

                    switch (opcaoCadastroSelecionada) {
                        case 1 -> {
                            this.corretorView.show(firma);
                        }
                        case 2 -> {
                            this.clienteView.show(firma);
                        }
                        default -> {
                        }
                    }

                }
                case 2 -> {
                    Corretor corretorSelecionado = this.corretorView.getListaDeCorretoresPorFirma(firma);
                }
                case 3 -> {
                }
                case 4 -> {
                }
                default -> {
                }
            }
        } while (opcaoSelecionada != 0);
    }
}
