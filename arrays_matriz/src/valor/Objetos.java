package valor;

/**
 *
 * @author willian
 */
public class Objetos {

    String forma;
    String nome;
    float size;
    float peso;

    public Objetos(String forma, String nome, float size, float peso) {
        this.forma = forma;
        this.nome = nome;
        this.size = size;
        this.peso = peso;
    }    

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
