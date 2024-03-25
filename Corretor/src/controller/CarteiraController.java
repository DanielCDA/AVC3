package Corretor.src.controller;

import java.util.ArrayList;

import Corretor.src.Models.Carteira;
import Corretor.src.Models.Corretor;
import Corretor.src.Repositories.CarteiraRepository;

public class CarteiraController {
    private CarteiraRepository carteiraRepository;

    public CarteiraController(CarteiraRepository repository) {
        this.carteiraRepository = repository;
    }

    public ArrayList<Carteira> getCarteirasPorCorrector(Corretor corretor) {
        return this.carteiraRepository.getCarteirasPorCorrector(corretor);
    }
}
