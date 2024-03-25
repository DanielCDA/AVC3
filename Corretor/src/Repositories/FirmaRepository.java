package Corretor.src.Repositories;

public class FirmaRepository  extends BaseRepository<Firma>{

    public Firma getPorNome(String nome){
        ArrayList<Firma> repo = this.getRepoData();
        for (int i = 0; i < repo.size(); i++) {
            Firma currentFirma = repo.get(i);

            if (currentFirma.getNomeEmpresa().equals(nome)) {
                return currentFirma;
            }
        }

        return null;
    }

    public Firma getPorEmail(String email) {
        ArrayList<Firma> repo = this.getRepoData();
        for (int i = 0; i < repo.size(); i++) {
            Firma currentFirma = repo.get(i);

            if (currentFirma.getEmail().equals(email)) {
                return currentFirma;
            }
        }

        return null;
    }
}