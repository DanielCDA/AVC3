public class EmpresaServicos{
    private String nome;
    private String tipoServico;

    public EmpresaServicos(String nome, String tipoServico){
        this.nome = nome;
        this.tipoServico = tipoServico;
    }

    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getTipoServico(){
        return tipoServico;
    }

    public void setTipoServico(String tipoServico){
        this.tipoServico = tipoServico;
    }

    
}