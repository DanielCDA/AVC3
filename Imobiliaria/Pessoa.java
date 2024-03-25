package Imobiliaria;

public class Pessoa {
    protected String nomeCompleto;
    protected int anoNascimnto;
    protected String genero;
    protected int contacto;
    protected String email;

    public Pessoa(String nomeCompleto, int anoNascimnto, String genero, int contacto, String email){
        this.nomeCompleto =  nomeCompleto;
        this.anoNascimnto = anoNascimnto;
        this.genero = genero;
        this.contacto = contacto;
        this.email = email;
    }
    public Pessoa(){}

    public String nomeCompleto(){
        return nomeCompleto;
    }

    public int anoNascimnto(){
        return anoNascimnto;
    }

    public String genero(){
        return genero;
    }

    public int contacto(){
        return contacto;
    }

    public String email(){
        return email;
    }
}
