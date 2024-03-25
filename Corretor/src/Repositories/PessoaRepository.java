package Corretor.src.Repositories;

import Corretor.src.Models.*;
import java.util.ArrayList;

public class PessoaRepository<T extends Pessoa> extends BaseRepository<T> {
    public Pessoa getPorEmail(String email) {
        ArrayList<T> repo = this.getRepoData();
        for (int i = 0; i < repo.size(); i++) {
            Pessoa currentPessoa = repo.get(i);

            if (currentPessoa.getEmail().equals(email)) {
                return currentPessoa;
            }
        }

        return null;
    }
}
