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
import entidades.OrdemServico;
import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import util.JpaUtil;

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanOrdemServico {

    private OrdemServico ordemdeservico = new OrdemServico();
    private List<OrdemServico> ordensdeservico = new ArrayList<>();
    
    @PostConstruct
    private void init(){
        carregarTodos();
    }
    
    public void salvar(){
        EntityManager manager = JpaUtil.getManager();
        manager.getTransaction().begin();        
        manager.persist(ordemdeservico);
        manager.getTransaction().commit();
        JpaUtil.fecharEntityManager(manager);
        carregarTodos();
        
    }

    private void carregarTodos(){
            EntityManager manager = JpaUtil.getManager();
            ordensdeservico = manager.createQuery("from OrdemServico", OrdemServico.class).getResultList();
            JpaUtil.fecharEntityManager(manager);
    }
    
    public OrdemServico getOrdemdeservico() {
        return ordemdeservico;
    }

    public void setOrdemdeservico(OrdemServico ordemdeservico) {
        this.ordemdeservico = ordemdeservico;
    }

    public List<OrdemServico> getOrdensdeservico() {
        return ordensdeservico;
    }

    public void setOrdensdeservico(List<OrdemServico> ordensdeservico) {
        this.ordensdeservico = ordensdeservico;
    }
    
    
    public beanOrdemServico() {
    }
    
}
