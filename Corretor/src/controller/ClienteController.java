package Corretor.src.controller;

import Corretor.src.Models.Cliente;
import Corretor.src.Repositories.ClienteRepository;

public class ClienteController extends LoginController {
    private ClienteRepository clienteRepo;
    public ClienteController(ClienteRepository clienteRepository)
    {
        super(clienteRepository);
        this.clienteRepo = clienteRepository;
    }

    public void cadastrar (Cliente cliente){
        this.clienteRepo.create(cliente);
    }
}
