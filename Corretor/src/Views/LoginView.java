package Corretor.src.Views;

import Corretor.src.Models.Cliente;
import Corretor.src.Models.Corretor;
import Corretor.src.Models.Firma;
import Corretor.src.Models.LoginResult;
import Corretor.src.controller.*;

public class LoginView extends BaseView implements BaseViewInterface {
    private CorretorController corretorController;
    private FirmaController firmaController;
    private ClienteController clienteController;

    public LoginView(CorretorController corretorController, FirmaController firmaController, ClienteController clienteController) {
        this.corretorController = corretorController;
        this.clienteController = clienteController;
        this.firmaController = firmaController;
    }

    @Override
    public Object show() {

        int opcaoSelecionada;
        do {
            System.out.println("Entrar como: ?");
            System.out.println("");
            System.out.println("1 - Corretor");
            System.out.println("2 - Empresa");
            System.out.println("3 - Cliente");
            System.out.println("0 - Sair");
            System.out.println("");
            System.out.print("Escolha uma opcao: ");

            opcaoSelecionada = scanner.nextInt();
        } while (opcaoSelecionada < 0 || opcaoSelecionada > 3);

        System.out.println("Digite o seu e-mail: ");
        String email= scanner.next();
        System.out.println("Palavra-Passe: ");
        String password = scanner.next();


        switch (opcaoSelecionada) {
            case 1 ->{
                Corretor corretor = (Corretor) this.corretorController.login(email, password);
                return new LoginResult(corretor, opcaoSelecionada);
            }
            
            case 2 ->{
                Firma firma = this.firmaController.login(email, password);
                return new LoginResult(firma, opcaoSelecionada);
            }
                
            case 3 ->{
                Cliente cliente = (Cliente) this.clienteController.login(email, password);
                return new LoginResult(cliente, opcaoSelecionada);
            }
                
            case 0 ->{
                System.out.println("Saindo...");
                return null;
            }
                
            default -> {
                return null;
            }
                
        }

    }
}
