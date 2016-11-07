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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name = "tbCliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCliente.findAll", query = "SELECT t FROM TbCliente t"),
    @NamedQuery(name = "TbCliente.findByCodCliente", query = "SELECT t FROM TbCliente t WHERE t.codCliente = :codCliente"),
    @NamedQuery(name = "TbCliente.findByRazaoSocial", query = "SELECT t FROM TbCliente t WHERE t.razaoSocial = :razaoSocial"),
    @NamedQuery(name = "TbCliente.findByCgcCpf", query = "SELECT t FROM TbCliente t WHERE t.cgcCpf = :cgcCpf"),
    @NamedQuery(name = "TbCliente.findByInscrEstadualRG", query = "SELECT t FROM TbCliente t WHERE t.inscrEstadualRG = :inscrEstadualRG"),
    @NamedQuery(name = "TbCliente.findByEndereco", query = "SELECT t FROM TbCliente t WHERE t.endereco = :endereco"),
    @NamedQuery(name = "TbCliente.findByNumero", query = "SELECT t FROM TbCliente t WHERE t.numero = :numero"),
    @NamedQuery(name = "TbCliente.findByComplemento", query = "SELECT t FROM TbCliente t WHERE t.complemento = :complemento"),
    @NamedQuery(name = "TbCliente.findByBairro", query = "SELECT t FROM TbCliente t WHERE t.bairro = :bairro"),
    @NamedQuery(name = "TbCliente.findByCidade", query = "SELECT t FROM TbCliente t WHERE t.cidade = :cidade"),
    @NamedQuery(name = "TbCliente.findByEstado", query = "SELECT t FROM TbCliente t WHERE t.estado = :estado"),
    @NamedQuery(name = "TbCliente.findByCep", query = "SELECT t FROM TbCliente t WHERE t.cep = :cep"),
    @NamedQuery(name = "TbCliente.findByTelefone1", query = "SELECT t FROM TbCliente t WHERE t.telefone1 = :telefone1"),
    @NamedQuery(name = "TbCliente.findByTelefone2", query = "SELECT t FROM TbCliente t WHERE t.telefone2 = :telefone2"),
    @NamedQuery(name = "TbCliente.findByTelefone3", query = "SELECT t FROM TbCliente t WHERE t.telefone3 = :telefone3"),
    @NamedQuery(name = "TbCliente.findByTelefone4", query = "SELECT t FROM TbCliente t WHERE t.telefone4 = :telefone4"),
    @NamedQuery(name = "TbCliente.findByRepresentante", query = "SELECT t FROM TbCliente t WHERE t.representante = :representante"),
    @NamedQuery(name = "TbCliente.findByNomeFantasia", query = "SELECT t FROM TbCliente t WHERE t.nomeFantasia = :nomeFantasia"),
    @NamedQuery(name = "TbCliente.findByTipoPessoa", query = "SELECT t FROM TbCliente t WHERE t.tipoPessoa = :tipoPessoa"),
    @NamedQuery(name = "TbCliente.findByEmail", query = "SELECT t FROM TbCliente t WHERE t.email = :email")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CodCliente")
    private Integer codCliente;
    @Column(name = "RazaoSocial")
    private String razaoSocial;
    @Column(name = "CGC_CPF")
    private String cgcCpf;
    @Column(name = "InscrEstadual_RG")
    private String inscrEstadualRG;
    @Column(name = "Endereco")
    private String endereco;
    @Column(name = "Numero")
    private Integer numero;
    @Column(name = "Complemento")
    private String complemento;
    @Column(name = "Bairro")
    private String bairro;
    @Column(name = "Cidade")
    private String cidade;
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Cep")
    private String cep;
    @Column(name = "Telefone1")
    private String telefone1;
    @Column(name = "Telefone2")
    private String telefone2;
    @Column(name = "Telefone3")
    private String telefone3;
    @Column(name = "Telefone4")
    private String telefone4;
    @Column(name = "Representante")
    private String representante;
    @Column(name = "NomeFantasia")
    private String nomeFantasia;
    @Lob
    @Column(name = "Observacao")
    private String observacao;
    @Column(name = "TipoPessoa")
    private Character tipoPessoa;
    @Column(name = "Email")
    private String email;

    public Cliente() {
    }

    public Cliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCgcCpf() {
        return cgcCpf;
    }

    public void setCgcCpf(String cgcCpf) {
        this.cgcCpf = cgcCpf;
    }

    public String getInscrEstadualRG() {
        return inscrEstadualRG;
    }

    public void setInscrEstadualRG(String inscrEstadualRG) {
        this.inscrEstadualRG = inscrEstadualRG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getTelefone3() {
        return telefone3;
    }

    public void setTelefone3(String telefone3) {
        this.telefone3 = telefone3;
    }

    public String getTelefone4() {
        return telefone4;
    }

    public void setTelefone4(String telefone4) {
        this.telefone4 = telefone4;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Character getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(Character tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        return !((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente)));
    }

    @Override
    public String toString() {
        return "packEntidades.TbCliente[ codCliente=" + codCliente + " ]";
    }
    
}
