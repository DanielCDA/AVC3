package Corretor.src.controller;

import java.util.ArrayList;

import Corretor.src.Models.Corretor;
import Corretor.src.Models.Firma;
import Corretor.src.Repositories.CorretorRepository;

public class CorretorController extends LoginController {
    private CorretorRepository coRepo;
    public CorretorController(CorretorRepository corretorRepository)
    {
        super(corretorRepository);
        this.coRepo = corretorRepository;
    }

    public void cadastrar(Corretor corretor){
        this.coRepo.create(corretor);
    }

    public ArrayList<Corretor> getListaDeCorretoresPorFirma(Firma firma) {
        return this.coRepo.getListaDeCorretoresPorFirma(firma);
}
