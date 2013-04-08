package in.jgabriellima.agendajs.model;
/**
 * @author  J. Gabriel Lima 
 * @email   jgabriel.ufpa@gmail.com
 * @site    http://www.jgabriellima.in
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Agenda implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String celular;
    private String descricao;

    public Agenda() {
    }

    public Agenda(String nome, String email, String telefone, String celular, String descricao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 17 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 17 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 17 * hash + (this.celular != null ? this.celular.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agenda other = (Agenda) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if ((this.telefone == null) ? (other.telefone != null) : !this.telefone.equals(other.telefone)) {
            return false;
        }
        if ((this.celular == null) ? (other.celular != null) : !this.celular.equals(other.celular)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agenda{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular + '}';
    }
}
