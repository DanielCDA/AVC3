package AVC3.GestaoDeCondominios;

import java.util.ArrayList;
import java.util.List;

public class Condominio {
    private List<Condomino> condominos;
    private List<Funcionario> funcionarios;
    private List<EmpresaServicos> empresasServicos;
    private List<Relatorio> relatorios;

    public Condominio() {
        condominos = new ArrayList<>();
        funcionarios = new ArrayList<>();
        empresasServicos = new ArrayList<>();
        relatorios = new ArrayList<>();
    }

    public void adicionarCondomino(Condomino condomino) {
        condominos.add(condomino);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarEmpresaServicos(EmpresaServicos empresaServicos) {
        empresasServicos.add(empresaServicos);
    }

    public void emitirBalancete() {
        // Lógica para emitir o balancete
    }

    public void gerarRelatórioContas() {
        // Lógica para gerar o relatório de contas
    }

    public void gerarOrçamento() {
        // Lógica para gerar o orçamento
    }
}
