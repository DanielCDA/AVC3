package Corretor.src.Models;

import java.util.Date;

public class MovimentoDeCarteira extends BaseModel {
    private String tipoMovimentacao;
    private String titulo;
    private int quantidade;
    private float valorTransacao;
    private Date data;
    private int hora;

    public MovimentoDeCarteira(String tipoMovimentacao, String titulo, int quantidade,float valorTransacao, Date data, int hora){
        this.tipoMovimentacao = tipoMovimentacao;
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.valorTransacao = valorTransacao;
        this.data = data;
        this.hora = hora;
    }

    public void setTipoMovimentacao (String tipoMovimentacao){
        this.tipoMovimentacao = tipoMovimentacao;
    }
    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }
    public void setTitulo (String titulo){
        this.titulo = titulo;
    }
    public String getTitulo (){
        return titulo;
    }
    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade (){
        return quantidade;
    }
    public void setValorTransacao (float valorTransacao){
        this.valorTransacao = valorTransacao;
    }
    public float getValorTransacao (){
        return valorTransacao;
    }
    public void setData (Date data){
        this.data = data;
    }
    public Date getData (){
        return data;
    }
    public void setHora (int hora){
        this.hora = hora;
    }
    public int getHora (){
        return hora;
    }
}
