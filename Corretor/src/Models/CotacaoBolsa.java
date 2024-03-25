package Corretor.src.Models;

public class CotacaoBolsa extends BaseModel {
    private String status;

    public CotacaoBolsa(String status){
        this.status = status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
