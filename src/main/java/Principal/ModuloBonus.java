package Principal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ModuloBonus {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
        new Vendedor(1, "Wesley", new BigDecimal("120000.00"), 1),
        new Gerente(2, "Luiz", new BigDecimal("180000.00"), 2),
        new Vendedor(3, "Nicollas", new BigDecimal("140000.00"), 1),
        new Vendedor(4, "Willian", new BigDecimal("160000.00"), 1));
        
        Departamento[] departamentos = {
            new Departamento(1, "Impressoras", new BigDecimal("50000.00")),
            new Departamento(1, "Moderação", new BigDecimal("60000.00")),
            new Departamento(1, "Vendas", new BigDecimal("80000.00"))
        };
     int resultado = ControleBonus.aplicarBonus(funcionarios, departamentos);
        System.out.println("Codigo de retorno" + resultado);
        
        for(Funcionario f: funcionarios){
            System.out.println("Funcionario: "+f.getNome()+"| Salario novo " + f.getSalario());
        }
    }
}
