package Corretor.src.controller;

import Corretor.src.Models.*;
import Corretor.src.Repositories.PessoaRepository;

public class LoginController {
    private PessoaRepository peopleRepo;
    protected Pessoa pessoaLogada;

    public LoginController(PessoaRepository repo)
    {
        this.peopleRepo = repo;
    }

    public Pessoa login(String email, String password) {
        if (email.isEmpty() || password.isEmpty()) {
            System.out.println("Preencha todos os campos por favor!");
            return null;
        }

        Pessoa currentPessoa = this.peopleRepo.getPorEmail(email);
        if (currentPessoa == null) {
            System.out.println("Credencias invalidas");
            return null;
        }

        if (!currentPessoa.getPassword().equals(password)) {
            System.out.println("Credencias invalidas");
            return null;
        }

        this.pessoaLogada = currentPessoa;
        return currentPessoa;
    }
}
