/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "tbbalancas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbbalancas.findAll", query = "SELECT t FROM Tbbalancas t"),
    @NamedQuery(name = "Tbbalancas.findByBalancaTipo", query = "SELECT t FROM Tbbalancas t WHERE t.balancaTipo = :balancaTipo"),
    @NamedQuery(name = "Tbbalancas.findByMarcaModelo", query = "SELECT t FROM Tbbalancas t WHERE t.marcaModelo = :marcaModelo"),
    @NamedQuery(name = "Tbbalancas.findByPlataforma", query = "SELECT t FROM Tbbalancas t WHERE t.plataforma = :plataforma"),
    @NamedQuery(name = "Tbbalancas.findByCargaMaxima", query = "SELECT t FROM Tbbalancas t WHERE t.cargaMaxima = :cargaMaxima"),
    @NamedQuery(name = "Tbbalancas.findByNrInmetro", query = "SELECT t FROM Tbbalancas t WHERE t.nrInmetro = :nrInmetro"),
    @NamedQuery(name = "Tbbalancas.findByDataFab", query = "SELECT t FROM Tbbalancas t WHERE t.dataFab = :dataFab"),
    @NamedQuery(name = "Tbbalancas.findBySeloReparado", query = "SELECT t FROM Tbbalancas t WHERE t.seloReparado = :seloReparado"),
    @NamedQuery(name = "Tbbalancas.findByNrSerie", query = "SELECT t FROM Tbbalancas t WHERE t.nrSerie = :nrSerie"),
    @NamedQuery(name = "Tbbalancas.findByCdBalanca", query = "SELECT t FROM Tbbalancas t WHERE t.cdBalanca = :cdBalanca"),
    @NamedQuery(name = "Tbbalancas.findByDisponivel", query = "SELECT t FROM Tbbalancas t WHERE t.disponivel = :disponivel"),
    @NamedQuery(name = "Tbbalancas.findByValor", query = "SELECT t FROM Tbbalancas t WHERE t.valor = :valor"),
    @NamedQuery(name = "Tbbalancas.findByCdClienteBalanca", query = "SELECT t FROM Tbbalancas t WHERE t.cdClienteBalanca = :cdClienteBalanca")})
public class Balanca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "BalancaTipo")
    private String balancaTipo;
    @Column(name = "MarcaModelo")
    private String marcaModelo;
    @Column(name = "Plataforma")
    private String plataforma;
    @Column(name = "CargaMaxima")
    private String cargaMaxima;
    @Column(name = "NrInmetro")
    private String nrInmetro;
    @Column(name = "DataFab")
    @Temporal(TemporalType.DATE)
    private Date dataFab;
    @Column(name = "SeloReparado")
    private String seloReparado;
    @Column(name = "NrSerie")
    private String nrSerie;
    @Id
    @Basic(optional = false)
    @Column(name = "cdBalanca")
    private Integer cdBalanca;
    @Column(name = "Disponivel")
    private String disponivel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;
    @Basic(optional = false)
    @Column(name = "cdClienteBalanca")
    private int cdClienteBalanca;

    public Balanca() {
    }

    public Balanca(Integer cdBalanca) {
        this.cdBalanca = cdBalanca;
    }

    public Balanca(Integer cdBalanca, int cdClienteBalanca) {
        this.cdBalanca = cdBalanca;
        this.cdClienteBalanca = cdClienteBalanca;
    }

    public String getBalancaTipo() {
        return balancaTipo;
    }

    public void setBalancaTipo(String balancaTipo) {
        this.balancaTipo = balancaTipo;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(String cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public String getNrInmetro() {
        return nrInmetro;
    }

    public void setNrInmetro(String nrInmetro) {
        this.nrInmetro = nrInmetro;
    }

    public Date getDataFab() {
        return dataFab;
    }

    public void setDataFab(Date dataFab) {
        this.dataFab = dataFab;
    }

    public String getSeloReparado() {
        return seloReparado;
    }

    public void setSeloReparado(String seloReparado) {
        this.seloReparado = seloReparado;
    }

    public String getNrSerie() {
        return nrSerie;
    }

    public void setNrSerie(String nrSerie) {
        this.nrSerie = nrSerie;
    }

    public Integer getCdBalanca() {
        return cdBalanca;
    }

    public void setCdBalanca(Integer cdBalanca) {
        this.cdBalanca = cdBalanca;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getCdClienteBalanca() {
        return cdClienteBalanca;
    }

    public void setCdClienteBalanca(int cdClienteBalanca) {
        this.cdClienteBalanca = cdClienteBalanca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdBalanca != null ? cdBalanca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Balanca)) {
            return false;
        }
        Balanca other = (Balanca) object;
        if ((this.cdBalanca == null && other.cdBalanca != null) || (this.cdBalanca != null && !this.cdBalanca.equals(other.cdBalanca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "packEntidades.Tbbalancas[ cdBalanca=" + cdBalanca + " ]";
    }
    
}
