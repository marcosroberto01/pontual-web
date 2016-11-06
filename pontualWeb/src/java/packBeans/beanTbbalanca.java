/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import packEntidades.Tbbalancas;

/**
 *
 * @author Marcos
 */
@ManagedBean
@SessionScoped
public class beanTbbalanca {

    private Tbbalancas balanca = new Tbbalancas();
    private List<Tbbalancas> balancas = new ArrayList<>();

    public Tbbalancas getBalanca() {
        return balanca;
    }

    public void setBalanca(Tbbalancas balanca) {
        this.balanca = balanca;
    }

    public List<Tbbalancas> getBalancas() {
        return balancas;
    }

    public void setBalancas(List<Tbbalancas> balancas) {
        this.balancas = balancas;
    }

    public beanTbbalanca() {
    }

}
