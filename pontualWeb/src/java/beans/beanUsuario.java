/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import entidades.Usuario;
import javax.persistence.EntityManager;
import util.JpaUtil;
 

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanUsuario {

    private Usuario usuario = new Usuario();
    private List<Usuario> usuarios = new ArrayList<>();
    
    private void salvar() {
        usuario.setBloqueado("NAO");
        usuario.setSenhaSistema("");
        EntityManager manager = JpaUtil.getManager();
        manager.getTransaction().begin();        
        manager.persist(usuario);
        manager.getTransaction().commit();
        JpaUtil.fecharEntityManager(manager);
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public beanUsuario() {
    }

}
