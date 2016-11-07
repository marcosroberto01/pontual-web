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

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanOrdemServico {

    private OrdemServico ordemdeservico = new OrdemServico();
    private List<OrdemServico> ordensdeservico = new ArrayList<>();

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
