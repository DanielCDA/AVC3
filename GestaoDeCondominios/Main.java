public class Main {
    public static void main(String[] args) {
        Condominio condominio = new Condominio();

        Condomino condomino1 = new Condomino ("Antonio", "Predio A");
        Condomino condomino2 = new Condomino("Maria", "Edificio B");
        condominio.adicionarCondomino(condomino1);
        condominio.adicionarCondomino(condomino2);

        Funcionario funcionario1 = new Funcionario("Pedro", "Administrativo");
        Funcionario funcionario2 = new Funcionario("Ana", "Limpeza");
        condominio.adicionarFuncionario(funcionario1);
        condominio.adicionarFuncionario(funcionario2);
    }
}
