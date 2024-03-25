package Corretor.src.Models;

public class LoginResult {
    public BaseModel data;
    public int opcao;

    public LoginResult(BaseModel data, int opcao) {
        this.data = data;
        this.opcao = opcao;
    }

    public BaseModel getData(){
        return data;
    }
    public void setData(BaseModel data){
        this.data = data;
    }

    public int getOpcao(){
        return opcao;
    }
    public void setOpcao(int opcao){
        this.opcao = opcao;
    }
}
