/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packBeans;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import packEntidades.Tbos;

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanTbos {

    private Tbos ordemdeservico = new Tbos();
    private List<Tbos> ordensdeservico = new ArrayList<>();

    public Tbos getOrdemdeservico() {
        return ordemdeservico;
    }

    public void setOrdemdeservico(Tbos ordemdeservico) {
        this.ordemdeservico = ordemdeservico;
    }

    public List<Tbos> getOrdensdeservico() {
        return ordensdeservico;
    }

    public void setOrdensdeservico(List<Tbos> ordensdeservico) {
        this.ordensdeservico = ordensdeservico;
    }
    
    
    public beanTbos() {
    }
    
}
