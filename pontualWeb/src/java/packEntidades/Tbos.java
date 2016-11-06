/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packEntidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "tbos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbos.findAll", query = "SELECT t FROM Tbos t"),
    @NamedQuery(name = "Tbos.findByNrOs", query = "SELECT t FROM Tbos t WHERE t.nrOs = :nrOs"),
    @NamedQuery(name = "Tbos.findByDataOs", query = "SELECT t FROM Tbos t WHERE t.dataOs = :dataOs"),
    @NamedQuery(name = "Tbos.findByCdCliente", query = "SELECT t FROM Tbos t WHERE t.cdCliente = :cdCliente"),
    @NamedQuery(name = "Tbos.findByCdBalancaCliente", query = "SELECT t FROM Tbos t WHERE t.cdBalancaCliente = :cdBalancaCliente"),
    @NamedQuery(name = "Tbos.findByCdBalancaComodato", query = "SELECT t FROM Tbos t WHERE t.cdBalancaComodato = :cdBalancaComodato"),
    @NamedQuery(name = "Tbos.findByDesmontagem", query = "SELECT t FROM Tbos t WHERE t.desmontagem = :desmontagem"),
    @NamedQuery(name = "Tbos.findByReparoEletronico", query = "SELECT t FROM Tbos t WHERE t.reparoEletronico = :reparoEletronico"),
    @NamedQuery(name = "Tbos.findByCalibracaoPadrao", query = "SELECT t FROM Tbos t WHERE t.calibracaoPadrao = :calibracaoPadrao"),
    @NamedQuery(name = "Tbos.findByManutencaoPreventiva", query = "SELECT t FROM Tbos t WHERE t.manutencaoPreventiva = :manutencaoPreventiva"),
    @NamedQuery(name = "Tbos.findByPintura", query = "SELECT t FROM Tbos t WHERE t.pintura = :pintura"),
    @NamedQuery(name = "Tbos.findByMontagem", query = "SELECT t FROM Tbos t WHERE t.montagem = :montagem"),
    @NamedQuery(name = "Tbos.findByLimpezaQuimica", query = "SELECT t FROM Tbos t WHERE t.limpezaQuimica = :limpezaQuimica"),
    @NamedQuery(name = "Tbos.findByRevisaoCelulas", query = "SELECT t FROM Tbos t WHERE t.revisaoCelulas = :revisaoCelulas"),
    @NamedQuery(name = "Tbos.findByTrocaTeclado", query = "SELECT t FROM Tbos t WHERE t.trocaTeclado = :trocaTeclado"),
    @NamedQuery(name = "Tbos.findByCalibracaoComparativa", query = "SELECT t FROM Tbos t WHERE t.calibracaoComparativa = :calibracaoComparativa"),
    @NamedQuery(name = "Tbos.findByOutrosServicos", query = "SELECT t FROM Tbos t WHERE t.outrosServicos = :outrosServicos"),
    @NamedQuery(name = "Tbos.findByTecnico", query = "SELECT t FROM Tbos t WHERE t.tecnico = :tecnico"),
    @NamedQuery(name = "Tbos.findByHoraTecnica", query = "SELECT t FROM Tbos t WHERE t.horaTecnica = :horaTecnica"),
    @NamedQuery(name = "Tbos.findBySituacaoOrcamento", query = "SELECT t FROM Tbos t WHERE t.situacaoOrcamento = :situacaoOrcamento"),
    @NamedQuery(name = "Tbos.findByNrRelatorioEntrada", query = "SELECT t FROM Tbos t WHERE t.nrRelatorioEntrada = :nrRelatorioEntrada"),
    @NamedQuery(name = "Tbos.findByDtGarantia", query = "SELECT t FROM Tbos t WHERE t.dtGarantia = :dtGarantia"),
    @NamedQuery(name = "Tbos.findByFrmPgto", query = "SELECT t FROM Tbos t WHERE t.frmPgto = :frmPgto"),
    @NamedQuery(name = "Tbos.findByVlrDesconto", query = "SELECT t FROM Tbos t WHERE t.vlrDesconto = :vlrDesconto")})
public class Tbos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NrOs")
    private Integer nrOs;
    @Column(name = "DataOs")
    @Temporal(TemporalType.DATE)
    private Date dataOs;
    @Column(name = "CdCliente")
    private Integer cdCliente;
    @Lob
    @Column(name = "DefeitoInformado")
    private String defeitoInformado;
    @Column(name = "CdBalancaCliente")
    private Integer cdBalancaCliente;
    @Column(name = "CdBalancaComodato")
    @Temporal(TemporalType.TIME)
    private Date cdBalancaComodato;
    @Column(name = "Desmontagem")
    private String desmontagem;
    @Column(name = "ReparoEletronico")
    private String reparoEletronico;
    @Column(name = "CalibracaoPadrao")
    private String calibracaoPadrao;
    @Column(name = "ManutencaoPreventiva")
    private String manutencaoPreventiva;
    @Column(name = "Pintura")
    private String pintura;
    @Column(name = "Montagem")
    private String montagem;
    @Column(name = "LimpezaQuimica")
    private String limpezaQuimica;
    @Column(name = "RevisaoCelulas")
    private String revisaoCelulas;
    @Column(name = "TrocaTeclado")
    private String trocaTeclado;
    @Column(name = "CalibracaoComparativa")
    private String calibracaoComparativa;
    @Column(name = "OutrosServicos")
    private String outrosServicos;
    @Column(name = "Tecnico")
    private Integer tecnico;
    @Column(name = "HoraTecnica")
    private String horaTecnica;
    @Lob
    @Column(name = "ObsOrdem")
    private String obsOrdem;
    @Column(name = "SituacaoOrcamento")
    private String situacaoOrcamento;
    @Column(name = "nrRelatorioEntrada")
    private Integer nrRelatorioEntrada;
    @Column(name = "DtGarantia")
    @Temporal(TemporalType.DATE)
    private Date dtGarantia;
    @Column(name = "FrmPgto")
    private String frmPgto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VlrDesconto")
    private Double vlrDesconto;

    public Tbos() {
    }

    public Tbos(Integer nrOs) {
        this.nrOs = nrOs;
    }

    public Integer getNrOs() {
        return nrOs;
    }

    public void setNrOs(Integer nrOs) {
        this.nrOs = nrOs;
    }

    public Date getDataOs() {
        return dataOs;
    }

    public void setDataOs(Date dataOs) {
        this.dataOs = dataOs;
    }

    public Integer getCdCliente() {
        return cdCliente;
    }

    public void setCdCliente(Integer cdCliente) {
        this.cdCliente = cdCliente;
    }

    public String getDefeitoInformado() {
        return defeitoInformado;
    }

    public void setDefeitoInformado(String defeitoInformado) {
        this.defeitoInformado = defeitoInformado;
    }

    public Integer getCdBalancaCliente() {
        return cdBalancaCliente;
    }

    public void setCdBalancaCliente(Integer cdBalancaCliente) {
        this.cdBalancaCliente = cdBalancaCliente;
    }

    public Date getCdBalancaComodato() {
        return cdBalancaComodato;
    }

    public void setCdBalancaComodato(Date cdBalancaComodato) {
        this.cdBalancaComodato = cdBalancaComodato;
    }

    public String getDesmontagem() {
        return desmontagem;
    }

    public void setDesmontagem(String desmontagem) {
        this.desmontagem = desmontagem;
    }

    public String getReparoEletronico() {
        return reparoEletronico;
    }

    public void setReparoEletronico(String reparoEletronico) {
        this.reparoEletronico = reparoEletronico;
    }

    public String getCalibracaoPadrao() {
        return calibracaoPadrao;
    }

    public void setCalibracaoPadrao(String calibracaoPadrao) {
        this.calibracaoPadrao = calibracaoPadrao;
    }

    public String getManutencaoPreventiva() {
        return manutencaoPreventiva;
    }

    public void setManutencaoPreventiva(String manutencaoPreventiva) {
        this.manutencaoPreventiva = manutencaoPreventiva;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public String getMontagem() {
        return montagem;
    }

    public void setMontagem(String montagem) {
        this.montagem = montagem;
    }

    public String getLimpezaQuimica() {
        return limpezaQuimica;
    }

    public void setLimpezaQuimica(String limpezaQuimica) {
        this.limpezaQuimica = limpezaQuimica;
    }

    public String getRevisaoCelulas() {
        return revisaoCelulas;
    }

    public void setRevisaoCelulas(String revisaoCelulas) {
        this.revisaoCelulas = revisaoCelulas;
    }

    public String getTrocaTeclado() {
        return trocaTeclado;
    }

    public void setTrocaTeclado(String trocaTeclado) {
        this.trocaTeclado = trocaTeclado;
    }

    public String getCalibracaoComparativa() {
        return calibracaoComparativa;
    }

    public void setCalibracaoComparativa(String calibracaoComparativa) {
        this.calibracaoComparativa = calibracaoComparativa;
    }

    public String getOutrosServicos() {
        return outrosServicos;
    }

    public void setOutrosServicos(String outrosServicos) {
        this.outrosServicos = outrosServicos;
    }

    public Integer getTecnico() {
        return tecnico;
    }

    public void setTecnico(Integer tecnico) {
        this.tecnico = tecnico;
    }

    public String getHoraTecnica() {
        return horaTecnica;
    }

    public void setHoraTecnica(String horaTecnica) {
        this.horaTecnica = horaTecnica;
    }

    public String getObsOrdem() {
        return obsOrdem;
    }

    public void setObsOrdem(String obsOrdem) {
        this.obsOrdem = obsOrdem;
    }

    public String getSituacaoOrcamento() {
        return situacaoOrcamento;
    }

    public void setSituacaoOrcamento(String situacaoOrcamento) {
        this.situacaoOrcamento = situacaoOrcamento;
    }

    public Integer getNrRelatorioEntrada() {
        return nrRelatorioEntrada;
    }

    public void setNrRelatorioEntrada(Integer nrRelatorioEntrada) {
        this.nrRelatorioEntrada = nrRelatorioEntrada;
    }

    public Date getDtGarantia() {
        return dtGarantia;
    }

    public void setDtGarantia(Date dtGarantia) {
        this.dtGarantia = dtGarantia;
    }

    public String getFrmPgto() {
        return frmPgto;
    }

    public void setFrmPgto(String frmPgto) {
        this.frmPgto = frmPgto;
    }

    public Double getVlrDesconto() {
        return vlrDesconto;
    }

    public void setVlrDesconto(Double vlrDesconto) {
        this.vlrDesconto = vlrDesconto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrOs != null ? nrOs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbos)) {
            return false;
        }
        Tbos other = (Tbos) object;
        if ((this.nrOs == null && other.nrOs != null) || (this.nrOs != null && !this.nrOs.equals(other.nrOs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "packEntidades.Tbos[ nrOs=" + nrOs + " ]";
    }
    
}
