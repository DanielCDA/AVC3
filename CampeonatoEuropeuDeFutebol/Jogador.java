package CampeonatoEuropeuDeFutebol;

public class Jogador {
    private String nome;
    private int idade;
    // outros atributos relevantes
    
    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        // inicializar outros atributos
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
}
