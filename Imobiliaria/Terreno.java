package Imobiliaria;

public class Terreno {
    private String area;
    private String localidade;

    //contsrutor
    public Terreno (String area, String localidade){
        this.area =  area;
        this.localidade =  localidade;
    }

    // getters e setters

    public void setArea(String area){
        this.area = area;
    }
    public String getArea(){
        return area;
    }

    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }
    public String localidade ( String zona1, String zona2){
        return localidade;
    }
}
