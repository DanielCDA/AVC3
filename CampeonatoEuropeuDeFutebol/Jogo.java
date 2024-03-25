package CampeonatoEuropeuDeFutebol;

public class Jogo {
    private Equipe equipeCasa;
    private Equipe equipeVisitante;
    private int[] resultado; // resultado do jogo (gols)

    public Jogo(Equipe equipeCasa, Equipe equipeVisitante) {
        this.equipeCasa = equipeCasa;
        this.equipeVisitante = equipeVisitante;
        this.resultado = new int[2]; // inicializar com 0 gols
    }
    public Jogo(){}

    public Equipe getEquipeCasa() {
        return equipeCasa;
    }

    public void setEquipeCasa(Equipe equipeCasa) {
        this.equipeCasa = equipeCasa;
    }

    public Equipe getEquipeVisitante() {
        return equipeVisitante;
    }

    public void setEquipeVisitante(Equipe equipeVisitante) {
        this.equipeVisitante = equipeVisitante;
    }

    public int[] getResultado() {
        return resultado;
    }

    public void setResultado(int[] resultado) {
        this.resultado = resultado;
    }

    public void registrarResultado(int golsEquipeCasa, int golsEquipeVisitante) {
        resultado[0] = golsEquipeCasa;
        resultado[1] = golsEquipeVisitante;
        // atualizar outras estatísticas do jogo
    }
}
