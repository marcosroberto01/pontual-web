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
import packEntidades.Tbdetalheospecas;

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanDetalheOsPecas {

    private Tbdetalheospecas detalhe = new Tbdetalheospecas();
    private List<Tbdetalheospecas> detalhes = new ArrayList<>();

    public Tbdetalheospecas getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(Tbdetalheospecas detalhe) {
        this.detalhe = detalhe;
    }

    public List<Tbdetalheospecas> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(List<Tbdetalheospecas> detalhes) {
        this.detalhes = detalhes;
    }
    
    
    public beanDetalheOsPecas() {
    }
    
}
