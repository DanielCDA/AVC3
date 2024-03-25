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

    public void setAnoDeConstrucao(String anoDeConstrucao){
        this.anoDeConstrucao = anoDeConstrucao;
    }
    public String getAnoDeConstrucao(){
        return anoDeConstrucao;
    }

    public void setArea(String area){
        this.area = area;
    }
    public String getArea(){
        return area;
    }

    public void setTipologia(String tipologia){
        this.tipologia = tipologia;
    }
    public String getTipologia(){
        return tipologia;
    }
}
