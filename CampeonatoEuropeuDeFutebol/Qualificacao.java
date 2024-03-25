package CampeonatoEuropeuDeFutebol;

import java.util.ArrayList;
import java.util.HashMap;

public class Qualificacao {
     private ArrayList<Equipe> equipes;
    private HashMap<String, ArrayList<Jogo>> jogosPorGrupo;

    public Qualificacao(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
        this.jogosPorGrupo = new HashMap<>();
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public HashMap<String, ArrayList<Jogo>> getJogosPorGrupo() {
        return jogosPorGrupo;
    }

    public void setJogosPorGrupo(HashMap<String, ArrayList<Jogo>> jogosPorGrupo) {
        this.jogosPorGrupo = jogosPorGrupo;
    }

    public void adicionarJogoAoGrupo(String grupo, Jogo jogo) {
        if (!jogosPorGrupo.containsKey(grupo)) {
            jogosPorGrupo.put(grupo, new ArrayList<>());
        }
        jogosPorGrupo.get(grupo).add(jogo);
    }
}
