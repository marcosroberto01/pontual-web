/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packEntidades;

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
@Table(name = "tbdetalheospecas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbdetalheospecas.findAll", query = "SELECT t FROM Tbdetalheospecas t"),
    @NamedQuery(name = "Tbdetalheospecas.findByNrDetalhePecas", query = "SELECT t FROM Tbdetalheospecas t WHERE t.nrDetalhePecas = :nrDetalhePecas"),
    @NamedQuery(name = "Tbdetalheospecas.findByNrOsPecas", query = "SELECT t FROM Tbdetalheospecas t WHERE t.nrOsPecas = :nrOsPecas"),
    @NamedQuery(name = "Tbdetalheospecas.findByQuantidade", query = "SELECT t FROM Tbdetalheospecas t WHERE t.quantidade = :quantidade"),
    @NamedQuery(name = "Tbdetalheospecas.findByPrecoPeca", query = "SELECT t FROM Tbdetalheospecas t WHERE t.precoPeca = :precoPeca"),
    @NamedQuery(name = "Tbdetalheospecas.findByComissaoPecas", query = "SELECT t FROM Tbdetalheospecas t WHERE t.comissaoPecas = :comissaoPecas"),
    @NamedQuery(name = "Tbdetalheospecas.findByCdPeca", query = "SELECT t FROM Tbdetalheospecas t WHERE t.cdPeca = :cdPeca")})
public class Tbdetalheospecas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NrDetalhePecas")
    private Integer nrDetalhePecas;
    @Basic(optional = false)
    @Column(name = "NrOsPecas")
    private int nrOsPecas;
    @Basic(optional = false)
    @Column(name = "Quantidade")
    private double quantidade;
    @Basic(optional = false)
    @Column(name = "PrecoPeca")
    private double precoPeca;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ComissaoPecas")
    private Double comissaoPecas;
    @Basic(optional = false)
    @Column(name = "cdPeca")
    private int cdPeca;

    public Tbdetalheospecas() {
    }

    public Tbdetalheospecas(Integer nrDetalhePecas) {
        this.nrDetalhePecas = nrDetalhePecas;
    }

    public Tbdetalheospecas(Integer nrDetalhePecas, int nrOsPecas, double quantidade, double precoPeca, int cdPeca) {
        this.nrDetalhePecas = nrDetalhePecas;
        this.nrOsPecas = nrOsPecas;
        this.quantidade = quantidade;
        this.precoPeca = precoPeca;
        this.cdPeca = cdPeca;
    }

    public Integer getNrDetalhePecas() {
        return nrDetalhePecas;
    }

    public void setNrDetalhePecas(Integer nrDetalhePecas) {
        this.nrDetalhePecas = nrDetalhePecas;
    }

    public int getNrOsPecas() {
        return nrOsPecas;
    }

    public void setNrOsPecas(int nrOsPecas) {
        this.nrOsPecas = nrOsPecas;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoPeca() {
        return precoPeca;
    }

    public void setPrecoPeca(double precoPeca) {
        this.precoPeca = precoPeca;
    }

    public Double getComissaoPecas() {
        return comissaoPecas;
    }

    public void setComissaoPecas(Double comissaoPecas) {
        this.comissaoPecas = comissaoPecas;
    }

    public int getCdPeca() {
        return cdPeca;
    }

    public void setCdPeca(int cdPeca) {
        this.cdPeca = cdPeca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrDetalhePecas != null ? nrDetalhePecas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbdetalheospecas)) {
            return false;
        }
        Tbdetalheospecas other = (Tbdetalheospecas) object;
        if ((this.nrDetalhePecas == null && other.nrDetalhePecas != null) || (this.nrDetalhePecas != null && !this.nrDetalhePecas.equals(other.nrDetalhePecas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "packEntidades.Tbdetalheospecas[ nrDetalhePecas=" + nrDetalhePecas + " ]";
    }
    
}
