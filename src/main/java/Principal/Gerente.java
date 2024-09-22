
package Principal;

import java.math.BigDecimal;

/**
 *
 * @author Luiz
 */
public class Gerente extends Funcionario {
    public Gerente(int id, String nome, BigDecimal salario, int departamentoId) {
        super(id, nome, salario, departamentoId);
    }
}

