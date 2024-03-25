package CampeonatoEuropeuDeFutebol;

import java.util.ArrayList;
import java.util.HashMap;

public class Principal {
     // Criar jogadores
     Jogador jogador1 = new Jogador("Cristiano Ronaldo", 36);
        Jogador jogador2 = new Jogador("Lionel Messi", 34);

        // Criar equipes e adicionar jogadores
        Equipe equipe1 = new Equipe("Portugal");
        equipe1.adicionarJogador(jogador1);
        
        Equipe equipe2 = new Equipe("Argentina");
        equipe2.adicionarJogador(jogador2);

        // Criar jogo e registrar resultado
        Jogo jogo = new Jogo(equipe1, equipe2);
        jogo.registrarResultado(2, 1);

        // Criar fase de qualificação e adicionar equipes e jogos
        ArrayList<Equipe> equipesQualificacao = new ArrayList<>();
        equipesQualificacao.add(equipe1);
        equipesQualificacao.add(equipe2);

        Qualificacao faseQualificacao = new Qualificacao(equipesQualificacao);
        faseQualificacao.adicionarJogoAoGrupo("Grupo A", jogo);

        // Criar sistema e adicionar equipes, jogos e fase de qualificação
        SistemaEuroFutebol sistema = new SistemaEuroFutebol();
        sistema.adicionarEquipe(equipe1);
        sistema.adicionarEquipe(equipe2);
        sistema.adicionarJogo(jogo);
        sistema.setFaseQualificacao(faseQualificacao);

        // Exemplo de consulta
        System.out.println("Equipes:");
        for (Equipe equipe : sistema.getEquipes()) {
            System.out.println("- " + equipe.getNome());
        }

        System.out.println("\nJogos:");
        for (Jogo j : sistema.getJogos()) {
            System.out.println("Jogo: " + j.getEquipeCasa().getNome() + " vs " + j.getEquipeVisitante().getNome());
            System.out.println("Resultado: " + j.getResultado()[0] + " - " + j.getResultado()[1]);
            System.out.println();
        }

        System.out.println("\nJogos por grupo na fase de qualificação:");
        HashMap<String, ArrayList<Jogo>> jogosPorGrupo = faseQualificacao.getJogosPorGrupo();
        for (String grupo : jogosPorGrupo.keySet()) {
            System.out.println(grupo + ":");
            for (Jogo j : jogosPorGrupo.get(grupo)) {
                System.out.println("- " + j.getEquipeCasa().getNome() + " vs " + j.getEquipeVisitante().getNome());
            }
        }
    }
}