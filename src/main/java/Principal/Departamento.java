package Principal;

/**
 *
 * @author Luiz
 */
import java.math.BigDecimal;

public class Departamento {
    private int id;
    private String nome;
    private BigDecimal vendasTotais;
    
    public Departamento(int id, String nome, BigDecimal vendasTotais){
        this.id = id;
        this.nome = nome;
        this.vendasTotais = vendasTotais;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public BigDecimal getVendasTotais(){
        return vendasTotais;
    }
}
