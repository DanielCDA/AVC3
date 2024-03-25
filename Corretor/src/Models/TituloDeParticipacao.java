package Corretor.src.Models;

import java.util.Date;

public class TituloDeParticipacao extends BaseModel{
    private String empresaAssociated;
    private String designacao;
    private Date dataEmissao;
    private float valorFacial;

    public TituloDeParticipacao(String empresaAssociated, String designacao, Date dataEmissao, float valorFacial){
        this.empresaAssociated = empresaAssociated;
        this.designacao = designacao;
        this.dataEmissao = dataEmissao;
        this.valorFacial = valorFacial;
    }

    public void setEmpresaAssociated(String empresaAssociated){
        this.empresaAssociated = empresaAssociated;
    }
    public String getEmpresaAssociated(){
        return empresaAssociated;
    }
    public void setDesignacao(String designacao){
        this.designacao = designacao;
    }
    public String getDesignacao(){
        return designacao;
    }
    public void setDataEmissao(Date dataEmissao){
        this.dataEmissao = dataEmissao;
    }
    public Date getDataEmissao(){
        return dataEmissao;
    }
    public void setValorFacial(float valorFacial){
        this.valorFacial = valorFacial;
    }
    public float getValorFacial(){
        return valorFacial;
    }
}
