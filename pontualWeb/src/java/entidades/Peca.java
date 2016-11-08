/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "tbpecas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peca.findAll", query = "SELECT t FROM Tbpecas t"),
    @NamedQuery(name = "Peca.findByIdPeca", query = "SELECT t FROM Tbpecas t WHERE t.idPeca = :idPeca"),
    @NamedQuery(name = "Peca.findByDescricaoPeca", query = "SELECT t FROM Tbpecas t WHERE t.descricaoPeca = :descricaoPeca")})
public class Peca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPeca")
    private Integer idPeca;
    @Basic(optional = false)
    @Column(name = "DescricaoPeca")
    private String descricaoPeca;

    public Peca() {
    }

    public Peca(Integer idPeca) {
        this.idPeca = idPeca;
    }

    public Peca(Integer idPeca, String descricaoPeca) {
        this.idPeca = idPeca;
        this.descricaoPeca = descricaoPeca;
    }

    public Integer getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(Integer idPeca) {
        this.idPeca = idPeca;
    }

    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeca != null ? idPeca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peca)) {
            return false;
        }
        Peca other = (Peca) object;
        if ((this.idPeca == null && other.idPeca != null) || (this.idPeca != null && !this.idPeca.equals(other.idPeca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "packEntidades.Tbpecas[ idPeca=" + idPeca + " ]";
    }
    
}
