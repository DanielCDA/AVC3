package Corretor.src.Repositories;

import java.util.ArrayList;

public class CarteiraRepository extends BaseRepository<Carteira>{
    public ArrayList<Carteira> getCarteirasPorCorrector(Corretor corretor) {

        ArrayList<Carteira> carteiras = new ArrayList<>();
        for (int i = 0; i < this.getRepoData().size(); i++) {
            Carteira currentCarteira = this.getRepoData().get(i);

            if (currentCarteira.getCorretorResponsavel().getId() == currentCarteira.getId()) {
                carteiras.add(currentCarteira);
            }
        }

        return carteiras;
    }
}
