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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author guilherme
 */
@Entity
@Table(name = "tbos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdemServico.findAll", query = "SELECT o FROM OrdemServico o")
    , @NamedQuery(name = "OrdemServico.findByNrOs", query = "SELECT o FROM OrdemServico o WHERE o.nrOs = :nrOs")
    , @NamedQuery(name = "OrdemServico.findByDataOs", query = "SELECT o FROM OrdemServico o WHERE o.dataOs = :dataOs")
    , @NamedQuery(name = "OrdemServico.findByCdCliente", query = "SELECT o FROM OrdemServico o WHERE o.cdCliente = :cdCliente")
    , @NamedQuery(name = "OrdemServico.findByCdBalancaCliente", query = "SELECT o FROM OrdemServico o WHERE o.cdBalancaCliente = :cdBalancaCliente")
    , @NamedQuery(name = "OrdemServico.findByCdBalancaComodato", query = "SELECT o FROM OrdemServico o WHERE o.cdBalancaComodato = :cdBalancaComodato")
    , @NamedQuery(name = "OrdemServico.findByDesmontagem", query = "SELECT o FROM OrdemServico o WHERE o.desmontagem = :desmontagem")
    , @NamedQuery(name = "OrdemServico.findByReparoEletronico", query = "SELECT o FROM OrdemServico o WHERE o.reparoEletronico = :reparoEletronico")
    , @NamedQuery(name = "OrdemServico.findByCalibracaoPadrao", query = "SELECT o FROM OrdemServico o WHERE o.calibracaoPadrao = :calibracaoPadrao")
    , @NamedQuery(name = "OrdemServico.findByManutencaoPreventiva", query = "SELECT o FROM OrdemServico o WHERE o.manutencaoPreventiva = :manutencaoPreventiva")
    , @NamedQuery(name = "OrdemServico.findByPintura", query = "SELECT o FROM OrdemServico o WHERE o.pintura = :pintura")
    , @NamedQuery(name = "OrdemServico.findByMontagem", query = "SELECT o FROM OrdemServico o WHERE o.montagem = :montagem")
    , @NamedQuery(name = "OrdemServico.findByLimpezaQuimica", query = "SELECT o FROM OrdemServico o WHERE o.limpezaQuimica = :limpezaQuimica")
    , @NamedQuery(name = "OrdemServico.findByRevisaoCelulas", query = "SELECT o FROM OrdemServico o WHERE o.revisaoCelulas = :revisaoCelulas")
    , @NamedQuery(name = "OrdemServico.findByTrocaTeclado", query = "SELECT o FROM OrdemServico o WHERE o.trocaTeclado = :trocaTeclado")
    , @NamedQuery(name = "OrdemServico.findByCalibracaoComparativa", query = "SELECT o FROM OrdemServico o WHERE o.calibracaoComparativa = :calibracaoComparativa")
    , @NamedQuery(name = "OrdemServico.findByOutrosServicos", query = "SELECT o FROM OrdemServico o WHERE o.outrosServicos = :outrosServicos")
    , @NamedQuery(name = "OrdemServico.findByTecnico", query = "SELECT o FROM OrdemServico o WHERE o.tecnico = :tecnico")
    , @NamedQuery(name = "OrdemServico.findByHoraTecnica", query = "SELECT o FROM OrdemServico o WHERE o.horaTecnica = :horaTecnica")
    , @NamedQuery(name = "OrdemServico.findBySituacaoOrcamento", query = "SELECT o FROM OrdemServico o WHERE o.situacaoOrcamento = :situacaoOrcamento")
    , @NamedQuery(name = "OrdemServico.findByNrRelatorioEntrada", query = "SELECT o FROM OrdemServico o WHERE o.nrRelatorioEntrada = :nrRelatorioEntrada")
    , @NamedQuery(name = "OrdemServico.findByDtGarantia", query = "SELECT o FROM OrdemServico o WHERE o.dtGarantia = :dtGarantia")
    , @NamedQuery(name = "OrdemServico.findByFrmPgto", query = "SELECT o FROM OrdemServico o WHERE o.frmPgto = :frmPgto")
    , @NamedQuery(name = "OrdemServico.findByVlrDesconto", query = "SELECT o FROM OrdemServico o WHERE o.vlrDesconto = :vlrDesconto")})
public class OrdemServico implements Serializable {

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

    public OrdemServico() {
    }

    public OrdemServico(Integer nrOs) {
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
        if (!(object instanceof OrdemServico)) {
            return false;
        }
        OrdemServico other = (OrdemServico) object;
        if ((this.nrOs == null && other.nrOs != null) || (this.nrOs != null && !this.nrOs.equals(other.nrOs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.OrdemServico[ nrOs=" + nrOs + " ]";
    }
    
}
