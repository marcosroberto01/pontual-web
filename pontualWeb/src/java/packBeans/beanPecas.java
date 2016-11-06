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
import packEntidades.Tbpecas;
 
@ManagedBean
@SessionScoped
public class beanPecas {

   private Tbpecas peca = new Tbpecas();
    private List<Tbpecas> pecas = new ArrayList<>();

    public Tbpecas getPeca() {
        return peca;
    }

    public void setPeca(Tbpecas peca) {
        this.peca = peca;
    }

    public List<Tbpecas> getPecas() {
        return pecas;
    }

    public void setPecas(List<Tbpecas> pecas) {
        this.pecas = pecas;
    }
    
    
    public beanPecas() {
    }
    
}
