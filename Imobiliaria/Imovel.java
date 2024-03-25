package Imobiliaria;

public class Imovel {
    protected String  precoDeVenda;
    protected String localizacao;
    protected String endereco;
    protected String anoDeConstrucao;

    public Imovel(String precoDeVenda, String localizacao, String endereco, String anoDeConstrucao){

        this.precoDeVenda = precoDeVenda;
        this.localizacao = localizacao;
        this.endereco = endereco;
        this.anoDeConstrucao = anoDeConstrucao;
    }

    public imovel(){} 

    public String precoDeVenda(){
        return precoDeVenda;
    }
    public void setPrecoDeVenda(String precoDeVenda){
        this.precoDeVenda = precoDeVenda;
    }

    public String localizacao(){
        return localizacao;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }
}
