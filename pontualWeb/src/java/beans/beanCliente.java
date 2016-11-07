 
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
 
    public beanCliente() {
    }

    public void salvar(){
    
    salvar(cliente);
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
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
        
        
    }
    
}
