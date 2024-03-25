public class Main {
    public static void main(String[] args) {
        Condominio condominio = new Condominio();

        Condomino condomino1 = new Condomino ("Antonio", "Predio A");
        Condomino condomino2 = new Condomino("Maria", "Edificio B");
        condominio.adicionarCondomino(condomino1);
        condominio.adicionarCondomino(condomino2);
    }
}
