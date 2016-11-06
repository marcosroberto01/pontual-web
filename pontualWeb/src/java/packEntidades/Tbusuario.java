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
@Table(name = "tbusuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbusuario.findAll", query = "SELECT t FROM Tbusuario t"),
    @NamedQuery(name = "Tbusuario.findByIdUsuario", query = "SELECT t FROM Tbusuario t WHERE t.idUsuario = :idUsuario"),
    @NamedQuery(name = "Tbusuario.findByUsuario", query = "SELECT t FROM Tbusuario t WHERE t.usuario = :usuario"),
    @NamedQuery(name = "Tbusuario.findBySenha", query = "SELECT t FROM Tbusuario t WHERE t.senha = :senha"),
    @NamedQuery(name = "Tbusuario.findByBloqueado", query = "SELECT t FROM Tbusuario t WHERE t.bloqueado = :bloqueado"),
    @NamedQuery(name = "Tbusuario.findByConfirmarSenha", query = "SELECT t FROM Tbusuario t WHERE t.confirmarSenha = :confirmarSenha"),
    @NamedQuery(name = "Tbusuario.findBySenhaSistema", query = "SELECT t FROM Tbusuario t WHERE t.senhaSistema = :senhaSistema")})
public class Tbusuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdUsuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "Usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "Senha")
    private String senha;
    @Column(name = "Bloqueado")
    private String bloqueado;
    @Basic(optional = false)
    @Column(name = "ConfirmarSenha")
    private String confirmarSenha;
    @Basic(optional = false)
    @Column(name = "SenhaSistema")
    private String senhaSistema;

    public Tbusuario() {
    }

    public Tbusuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Tbusuario(Integer idUsuario, String usuario, String senha, String confirmarSenha, String senhaSistema) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.senhaSistema = senhaSistema;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public String getSenhaSistema() {
        return senhaSistema;
    }

    public void setSenhaSistema(String senhaSistema) {
        this.senhaSistema = senhaSistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbusuario)) {
            return false;
        }
        Tbusuario other = (Tbusuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "packEntidades.Tbusuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
