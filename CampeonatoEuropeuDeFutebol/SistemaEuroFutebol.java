package CampeonatoEuropeuDeFutebol;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaEuroFutebol {
     private ArrayList<Equipe> equipes;
    private HashMap<String, Equipe> equipesPorNome;
    private ArrayList<Jogo> jogos;
    private Qualificacao faseQualificacao;
    // outros atributos relevantes

    public SistemaEuroFutebol() {
        this.equipes = new ArrayList<>();
        this.equipesPorNome = new HashMap<>();
        this.jogos = new ArrayList<>();
        // inicializar outros atributos
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }

    public HashMap<String, Equipe> getEquipesPorNome() {
        return equipesPorNome;
    }

    public void setEquipesPorNome(HashMap<String, Equipe> equipesPorNome) {
        this.equipesPorNome = equipesPorNome;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    public Qualificacao getFaseQualificacao() {
        return faseQualificacao;
    }

    public void setFaseQualificacao(Qualificacao faseQualificacao) {
        this.faseQualificacao = faseQualificacao;
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
        equipesPorNome.put(equipe.getNome(), equipe);
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
        // atualizar outras informações após adicionar o jogo
    }
}
