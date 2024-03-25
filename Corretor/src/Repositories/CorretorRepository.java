package Corretor.src.Repositories;

import Corretor.src.Models.Carteira;
import Corretor.src.Models.Corretor;
import Corretor.src.Models.Firma;
import java.util.ArrayList;

public class CorretorRepository extends PessoaRepository<Corretor>{
    public ArrayList<Corretor> getListaDeCorretoresPorFirma (Firma firma) {
        ArrayList<Corretor> corretors = new ArrayList<>();
        for (int i = 0; i < this.getRepoData().size(); i++) {
            Corretor currentCorretor = this.getRepoData().get(i);

            if (currentCorretor.getFirma().getId() == firma.getId()) {
                corretors.add(currentCorretor);
            }
        }

        return corretors;
    }
}
