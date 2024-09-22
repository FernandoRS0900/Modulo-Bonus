
package Principal;

/**
 *
 * @author Luiz
 */
import java.math.BigDecimal;
public class Funcionario {
    private int id;
    private String nome;
    private BigDecimal salario;
    private int departamentoId;
    
    public Funcionario(int id, String nome, BigDecimal salario, int departamentoId){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamentoId = departamentoId;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public BigDecimal getSalario(){
        return salario;
    }
    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }
    public int getDepartamentoId(){
        return departamentoId;
    }
    public BigDecimal calcularBonus(String cargo){
        if(cargo.equals("Gerente")){
            return new BigDecimal("1000.00");
        }else if(cargo.equals("Vendedor")){
            if(salario.compareTo(new BigDecimal("150000.00"))>=0){
                return new BigDecimal("1000.00");
            }else{
                return new BigDecimal("2000.00");
            }
            
        }
        return BigDecimal.ZERO;
    }
}
