package Corretor.src.Models;


public class Corrector extends Pessoa {
    private String dataAdmissao;
    private String dataRecisao;
    private float salariobase;

    public Corrector(String nome, String dataNascimento, String sexo, String morada, String email, int contacto
    , String password, String bi, String dataAdmissao, String dataRecisao, float salarioBase, Firma firma){
        super(nome, dataNascimento, sexo, morada, email, contacto, password, bi, firma);
        this.dataAdmissao = dataAdmissao;
        this.dataRecisao= dataRecisao;
        this.salariobase = salarioBase;
    }


    public void setDataAdmissao(String dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }
    public String getDataAdmissao(){
        return dataAdmissao;
    }

    public void setDataRecisao(String dataDemissao){
        this.dataRecisao = dataRecisao;
    }
    public String getDataRecisao(){
        return dataRecisao;
    }
    public void setSalariobase(float salariobase){
        this.salariobase = salariobase;
    }
    public float getSalariobase(){
        return salariobase;
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
}
