package Corretor.src.Models;

public class Pessoa extends BaseModel{
    protected String nome;
    protected String dataNascimento;
    protected String sexo;
    protected String morada;
    protected String email;
    protected int contacto;
    protected String password;
    private String bi;

    private Firma firma;

    public Pessoa(String nome, String dataNascimento, String sexo, String morada, String email, int contacto, String password, String bi, Firma firma){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
        this.contacto = contacto;
        this.password = password;
        this.bi = bi;
        this.firma = firma;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setDataNascimento (String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public void setSexo (String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void setMorada (String morada){
        this.morada = morada;
    }
    public String getMorada(){
        return morada;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setContacto (int contacto){
        this.contacto = contacto;
    }
    public int getContacto(){
        return contacto;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setBi(String cpf) {
        this.bi = bi;
    }

    public String getBi() {
        return bi;
    }
}
