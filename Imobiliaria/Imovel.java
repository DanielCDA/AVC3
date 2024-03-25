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
}
