package Principal;

/**
 *
 * @author Luiz
 */
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    public static int aplicarBonus(List<Funcionario> funcionarios, Departamento[] departamentos) {
        if (funcionarios.isEmpty() || departamentos.length == 0) {
            return -1;
        }

        BigDecimal maiorVenda = BigDecimal.ZERO;
        for (Departamento d : departamentos) {
            if (d.getVendasTotais().compareTo(maiorVenda) > 0) {
                maiorVenda = d.getVendasTotais();
            }
        }
        List<Integer> maioresDepartamentos = new ArrayList<>();
        for (Departamento d : departamentos) {
            if (d.getVendasTotais().compareTo(maiorVenda) == 0) {
                maioresDepartamentos.add(d.getId());
            }
        }
        for (Funcionario f : funcionarios) {
            if (maioresDepartamentos.contains(f.getDepartamentoId())) {
                BigDecimal bonus = f.calcularBonus(f instanceof Gerente ? "Gerente" : "Vendedor");
                f.setSalario(f.getSalario().add(bonus));
            }
        }
        return 0;
    }
}
