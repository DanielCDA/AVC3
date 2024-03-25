package Corretor.src.Views;

public class CadastroView extends BaseView implements BaseViewInterface {

    private FirmaView firma;

   public CadastroView(FirmaView firma){
       this.firma = firma;

   }


    public void requestCadastro(){
        this.firma.show();
    }


    @Override
    public Object show() {
        return null;
    }
}
