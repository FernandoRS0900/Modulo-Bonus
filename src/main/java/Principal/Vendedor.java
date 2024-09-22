package Principal;

/**
 *
 * @author Luiz
 */
import java.math.BigDecimal;
public class Vendedor extends Funcionario {
    public Vendedor(int id, String nome, BigDecimal salario, int departamentoId){
            super(id, nome, salario, departamentoId);
    }
}
