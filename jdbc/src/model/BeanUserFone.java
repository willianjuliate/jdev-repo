package model;

/**
 *
 * @author willian
 */
public class BeanUserFone {
    private String nome, numero, email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\nnumero: " + numero + "\nemail: " + email;
    }
    
}
