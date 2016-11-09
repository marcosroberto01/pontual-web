 
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import entidades.Cliente;
import util.JpaUtil;

 
@ManagedBean
@ViewScoped
public class beanCliente {
    private Cliente cliente = new Cliente();
    private List<Cliente> clientes = new ArrayList<>();
    String tipoBusca;
    String busca;
 
    public beanCliente() {
    }
    
    public void buscar(){
        EntityManager manager = JpaUtil.getManager();       
        
        if(tipoBusca.equals("razaoSocial")) {
            cliente = (Cliente) manager.createNamedQuery("Cliente.findByRazaoSocial")
                    .setParameter("razaoSocial", busca)
                    .getSingleResult();
        } else if(tipoBusca.equals("nomeFantasia")) {
            cliente = (Cliente) manager.createNamedQuery("Cliente.findByNomeFantasia")
                    .setParameter("nomeFantasia", busca)
                    .getSingleResult();
        }
        
        JpaUtil.fecharEntityManager(manager);
    }

    public void salvar(){
    salvar(cliente);
    }

    public String getTipoBusca() {
        return tipoBusca;
    }

    public void setTipoBusca(String tipoBusca) {
        this.tipoBusca = tipoBusca;
    }

    public String getBusca() {
        return busca;
    }

    public void setBusca(String busca) {
        this.busca = busca;
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        EntityManager manager = JpaUtil.getManager();
        
        clientes = manager.createNamedQuery("Cliente.findAll").getResultList();
        
        JpaUtil.fecharEntityManager(manager);
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    private void salvar(Cliente cliente) {
        EntityManager manager = JpaUtil.getManager();
        manager.getTransaction().begin();        
        manager.persist(cliente);
        manager.getTransaction().commit();
        JpaUtil.fecharEntityManager(manager);
        cliente = new Cliente();
    }
    
}
