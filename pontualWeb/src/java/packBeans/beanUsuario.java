/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import packEntidades.Tbusuario;
 

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanUsuario {

    private Tbusuario usuario = new Tbusuario();
    private List<Tbusuario> usuarios = new ArrayList<>();

    public Tbusuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Tbusuario usuario) {
        this.usuario = usuario;
    }

    public List<Tbusuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Tbusuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    public beanUsuario() {
    }

}
