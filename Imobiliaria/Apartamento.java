package Imobiliaria;

public class Apartamento extends Imovel {
    private String tipologia;
    private String area;

    public Apartamento(String anoDeConstrucao, String area, String tipologia, String precoDeVenda, String localizacao){
        super.localizacao = localizacao;
        super.anoDeConstrucao = anoDeConstrucao;
        this.area =  area;
        this.tipologia = tipologia;
        super.precoDeVenda = precoDeVenda;
    }
}
