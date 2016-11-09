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
import entidades.Balanca;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import util.JpaUtil;

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanBalanca {

    private Balanca balanca = new Balanca();
    private List<Balanca> balancas = new ArrayList<>();

    String busca;

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }

    public Balanca getBalanca() {
        return balanca;
    }

    public void setBalanca(Balanca balanca) {
        this.balanca = balanca;
    }

    public List<Balanca> getBalancas() {
        return balancas;
    }

    public void setBalancas(List<Balanca> balancas) {
        this.balancas = balancas;
    }

    public beanBalanca() {
    }

    private void salvar(Balanca balanca) {
        EntityManager manager = JpaUtil.getManager();
        manager.getTransaction().begin();
        manager.merge(balanca);
        manager.getTransaction().commit();
        JpaUtil.fecharEntityManager(manager);
        balanca = new Balanca();
    }

    public void salvar() {
        salvar(balanca);
    }

    public void buscar() {
        EntityManager manager = JpaUtil.getManager();
        Query query = manager.createNamedQuery("Balanca.findByCdBalanca")
                .setParameter("cdBalanca", Integer.valueOf(busca));
        
        
        try {
            balanca = (Balanca) query.getSingleResult();
        } catch (NoResultException ex) {
            balanca = new Balanca();
        }
        JpaUtil.fecharEntityManager(manager);
    }
}
