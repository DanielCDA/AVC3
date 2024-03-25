package Corretor.src.Models;

public class Carteira extends BaseModel {
    private Corretor corretorResponsavel;
    private Cliente clienteAssociated;

    public Carteira(Corretor corretorResponsavel, Cliente clienteAssociated){
        this.corretorResponsavel = corretorResponsavel;
        this.clienteAssociated = clienteAssociated;
    }
    public void setCorretorResponsavel(Corretor corretorResponsavel){
        this.corretorResponsavel = corretorResponsavel;
    }
    public Corretor getCorretorResponsavel(){
        return corretorResponsavel;
    }
    public void setClienteAssociated(Cliente clienteAssociated){
        this.clienteAssociated = clienteAssociated;
    }
    public Cliente getClienteAssociated(){
        return clienteAssociated;
    }
}
