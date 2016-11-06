 
package packBeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import packEntidades.TbCliente;
import util.JpaUtil;

 
@ManagedBean
@ViewScoped
public class beanCliente {
    private TbCliente cliente = new TbCliente();
    private List<TbCliente> clientes = new ArrayList<>();
 
    public beanCliente() {
    }

    public void salvar(){
    
    salvar(cliente);
    }
    
    
    public TbCliente getCliente() {
        return cliente;
    }

    public void setCliente(TbCliente cliente) {
        this.cliente = cliente;
    }

    public List<TbCliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<TbCliente> clientes) {
        this.clientes = clientes;
    }

    private void salvar(TbCliente cliente) {
        EntityManager manager = JpaUtil.getManager();
        manager.getTransaction().begin();        
        manager.persist(cliente);
        manager.getTransaction().commit();
        JpaUtil.fecharEntityManager(manager);
        
        
    }
    
}
