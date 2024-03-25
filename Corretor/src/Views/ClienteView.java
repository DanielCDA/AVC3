package Corretor.src.Views;

import java.util.Scanner;

import Corretor.src.Models.BaseModel;
import Corretor.src.Models.Cliente;
import Corretor.src.Models.Firma;

public class ClienteView extends BaseModel{
    Scanner scanner = new Scanner(System.in);

    private ClienteController controller;
    public ClienteView(ClienteController controller){
        this.controller = controller;
    }

    public Cliente show(Firma firma) {
        System.out.print("Digite o nome do cliente: ");
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
        String password = scanner.next();
        System.out.print("Digite o numero do bilhete do cliente: ");
        String bi = scanner.next();


        Cliente cliente = new Cliente(nome, dataNascimento, sexo, morada, email,
                contacto, password, bi, firma);

        controller.cadastrar(cliente);

        System.out.println("Cliente cadastrado com sucesso!");

        return null;
    }
}
