puclic class EmpresaServicos{
    private String nome;
    private String tipoServico;

    public EmpresaServicos(String nome, String tipoServico){
        this.nome = nome;
        this.tipoServico = tipoServico;
    }

    public void getNome(){
        return nome;
    }

    public String setNome (String nome){
        this.nome = nome;
    }

    public void getTipoServico(){
        return tipoServico;
    }

    public String setTipoServico(String tipoServico){
        this.tipoServico = tipoServico;
    }

    
}