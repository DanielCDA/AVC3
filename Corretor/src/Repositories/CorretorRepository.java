package Corretor.src.Repositories;

public class CorretorRepository extends PessoaRepository<Corretor>{
    public ArrayList<Corretor> getListaDeCorretoresPorFirma(Firma firma) {
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
