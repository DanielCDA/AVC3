package Imobiliaria;

public class LoginCadastro {
    protected String nome;
    protected String email;
    protected String senha;

    public LoginCadastro(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

     // Getters e Setters
    // ...

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setEmail (String email){
        this.email  = email;
    }
    public String getEmail (){
        return email;
    }

    public void setSenha (String senha){
        this.senha  = senha;
    }
    public String getSenha (){
        return senha;
    }
}
