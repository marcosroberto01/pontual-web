/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import entidades.Peca;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import util.JpaUtil;
 
@ManagedBean
@ViewScoped
public class beanPecas {

   private Peca peca = new Peca();
    private List<Peca> pecas = new ArrayList<>();
    
    @PostConstruct
    private void init(){            
        buscarTodos();
    }
    
    public void salvar(){
        EntityManager manager = JpaUtil.getManager();
        manager.getTransaction().begin();        
        manager.persist(peca);
        manager.getTransaction().commit();
        JpaUtil.fecharEntityManager(manager);
        buscarTodos();
        
    }

    private void buscarTodos(){
        EntityManager manager = JpaUtil.getManager();
            pecas = manager.createQuery("from Peca", Peca.class).getResultList();
            JpaUtil.fecharEntityManager(manager);
    }
    
    public Peca getPeca() {
        return peca;
    }

    public void setPeca(Peca peca) {
        this.peca = peca;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }
    
    
    public beanPecas() {
    }
    
}
