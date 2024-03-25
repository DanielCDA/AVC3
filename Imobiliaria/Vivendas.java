package Imobiliaria;

public class Vivendas extends Imovel {
    
    private String anoDeConstrucao;
    private String area;
    private String tipologia;

    public Vivendas(String anoDeConstrucao, String area,String precoDeVenda, String tipologia, String localizacao){
        this.anoDeConstrucao = anoDeConstrucao;
        this.area =  area;
        this.tipologia = tipologia;
        super.precoDeVenda = precoDeVenda;
        super.localizacao = localizacao;

    }
}
