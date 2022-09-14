package exercicios.employess;
/**
 *
 * @author willian
 */
public class Employees {
    private int id;
    private String nome;
    private double salario;

    public Employees(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAumentoSalario(double percentage) {
        this.salario += (salario / 100) * percentage;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + salario;
    }    
    
}
