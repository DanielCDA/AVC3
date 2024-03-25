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

    public void setTipologia(String tipologia){
        this.tipologia = tipologia;
    }
    public String getTipologia(){
        return tipologia;
    }

    public void setArea(String area){
        this.area = area;
    }
    public String getArea(){
        return area;
    }
}
