package Corretor.src.controller;

import Corretor.src.Models.Firma;
import Corretor.src.Repositories.FirmaRepository;

public class FirmaController {

    private FirmaRepository firmaRepo;
    protected Firma firmaLogada;

    public FirmaController(FirmaRepository repo)
    {
        this.firmaRepo = repo;
    }

    public Firma login(String email, String password) {
        if (email.isEmpty() || password.isEmpty()) {
            System.out.println("Preencha todos os campos por favor!");
            return null;
        }


        Firma currentFirma = this.firmaRepo.getPorEmail(email);
        if (currentFirma == null) {
            System.out.println("Credenciais inválidas");
            return null;
        }

        if (!currentFirma.getPassword().equals(password)) {
            System.out.println("Credencias invalidas");
            return null;
        }

        this.firmaLogada = currentFirma;
        return currentFirma;
    }

    public void cadastrar (Firma firma) { this.firmaRepo.create(firma);}
}
