public class Condomino {
    private String nome;
    private String edificio;

    public Condomino(String nome, String edificio){
        this.nome = nome;
        this.edificio = edificio;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEdifico(){
        return edificio;
    }
    public void setEdificio(String edificio){
        this.edificio = edificio;
    }
}
