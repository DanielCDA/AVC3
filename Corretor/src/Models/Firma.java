package Corretor.src.Models;

public class Firma extends BaseModel {
    private String nomeEmpresa;
    private String email;
    private String password;

    public Firma(String nomeEmpresa, String email, String password){
        this.nomeEmpresa = nomeEmpresa;
        this.email = email;
        this.password = password;
    }
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }
    public String getNomeEmpresa(){
        return nomeEmpresa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
