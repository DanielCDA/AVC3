package CampeonatoEuropeuDeFutebol;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Equipe (String nome){
        this.nome = nome;
        this.jogadores = new ArrayList(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }
}
